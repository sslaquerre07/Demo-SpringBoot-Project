package com.example.movies;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
    //Lets the framework know that we want to instantiate this class for us
    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> allMovies(){
        //This findAll method defined within MongoRepository
        return movieRepository.findAll();
    }

    //Optional class needed since there is a possibility that the id does not exist
    //Note: This works for the private attribute that we labled with the id annotation in movie
    // public Optional<Movie> singleMovie(ObjectId id){
    //     return movieRepository.findById(id);
    // }

    //This is the more secure version by displaying the imdb id to the public
    // This style of dynamic query will work for any attribute of the class as long as it is unique
    public Optional<Movie> singleMovie(String imdbId){
        return movieRepository.findMovieByImdbId(imdbId);
    }
}
