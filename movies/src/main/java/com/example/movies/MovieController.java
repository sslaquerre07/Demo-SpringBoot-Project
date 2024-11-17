package com.example.movies;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//REST API Controller that we write within this API!

@RestController
// Any request to this particular endpoint will be handled by this controller
@RequestMapping("/api/v1/movies")
public class MovieController {
    @GetMapping
    public ResponseEntity<String> allMovies(){
        //Returning a response entity ensures that the HTTP response code is being returned
        return new ResponseEntity<String>("All Movies!", HttpStatus.OK);
    }
}
