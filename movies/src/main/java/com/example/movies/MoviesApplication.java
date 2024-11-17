//Defines package like any other Java project
package com.example.movies;

//Contains run method used to start the application
import org.springframework.boot.SpringApplication;
//Imports springboot annotations seen with the @
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//Lets framework know that this is a REST API and not just another class
public class MoviesApplication {

	public static void main(String[] args) {
		//Gives the ability to pass command line args if needed
		SpringApplication.run(MoviesApplication.class, args);
	}

	//Let's framework know that this method is a GET endpoint (/ on the inside indicates path within the webpage similar to Flask)
	//Not acutally used but here for instructional purposes
	// @GetMapping("/")
	// public String apiRoot(){
	// 	return "Hello World";
	// }

}
