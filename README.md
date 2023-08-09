# Movie Reviews Application

This is a Movie Reviews application developed using Spring Boot for the backend and React for the frontend.

## Backend

### Technologies Used

- Spring Boot
- Spring Data JPA
- Spring Web
- Spring Actuator
- MySQL (Database)

### Controllers

#### MovieController

The `MovieController` handles requests related to movies.

- `GET /api/v1/movies`: Retrieve a list of all movies.
- `GET /api/v1/movies/{imdbId}`: Retrieve details of a single movie by its IMDB ID.

#### ReviewController

The `ReviewController` manages reviews for movies.

- `POST /api/v1/reviews`: Create a new review for a movie.

## Frontend

### Technologies Used

- React
- Axios
- Material-UI
- React-Router-Dom
- Bootstrap

#### Hero Component

The `Hero` component displays a carousel of movies with associated details. It allows users to view trailers and navigate to movie reviews.

### Setup Instructions

1. Clone the repository: `git clone https://github.com/nish22ant/movieapp.git`
2. Set up the backend:
   - Configure MySQL database properties in `application.properties`.
   - Run the Spring Boot application.
3. Set up the frontend:
   - Navigate to the `frontend` directory: `cd frontend`.
   - Install dependencies: `npm install`.
   - Start the React app: `npm start`.
   - Access the app in your browser at `http://localhost:3000`.




