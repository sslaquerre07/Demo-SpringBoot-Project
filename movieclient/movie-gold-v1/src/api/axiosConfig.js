import axios from 'axios';

export default axios.create({
    //Base location that all api endpoints are derived from
    baseURL: 'http://localhost:8080/',
    //Allows the CORS to not be an issue
    headers: {"ngrok-skip-browser-warning": "true"}
})