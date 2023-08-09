import axios from "axios";

export default axios.create({
    baseURL:'http://localhost:65535',
    withCredentials: false,
})