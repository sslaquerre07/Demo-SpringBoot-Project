import './App.css';
//Import axios from the config file
import api from './api/axiosConfig';
import {useState, useEffect} from 'react'
import Layout from './components/Layout';
import Home from './components/home/Home';
import {Routes, Route} from 'react-router-dom';

function App() {
  const [movies, setMovies] = useState([]);
  //Asynchronous function that gets movies, base url is assumed in the apiConfig file
  const getMovies = async() => {
    try{
      const response = await api.get("/api/v1/movies");
      console.log(response.data);
      setMovies(response.data);
    } catch(err){
      console.log(err);
    }
  }

  //Executes getMovies when the page is first loaded
  useEffect(() => {
    getMovies();
  }, [])

  return (
    <div className="App">
      <Routes>
        <Route path="/" element={<Layout/>}>
          <Route path="/" element={<Home movies={movies}/>}></Route>
        </Route>
      </Routes>
    </div>
  );
}

export default App;
