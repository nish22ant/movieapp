import api from "../../api/axiosConfig";
import { Container, Row, Col } from "react-bootstrap";
import { useState } from "react";

const Acutator = () => {
    const [actuator, setActuator] = useState("")
    const getActuatorData = async(e) => {
        e.preventDefault();
        try {
            const response = await api.get("/actuator");
            console.log("Actuator" + response);
            setActuator(response);
        } catch(err) {
            console.log(err);
        }
        
    }

    return (
        <Container onClick={getActuatorData}>
            <h1>qwerty: {actuator}</h1>
        </Container>
    )
    

}

export default Acutator;