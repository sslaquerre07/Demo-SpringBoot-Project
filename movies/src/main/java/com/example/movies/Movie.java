package com.example.movies;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//Let framework know that this class represents each document in movie collection 
@Document(collection = "movies")
//Takes care of getters/setters etc.
@Data
//Creates a constructor that takes all the private fields as arguments
@AllArgsConstructor
//Self explanatory
@NoArgsConstructor
public class Movie {
    //These should represent all the necessary properties from the database
    //Lets framework know that this is the primary identifier
    @Id
    private ObjectId id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<String> genres;
    private List<String> backdrops;
    //Causes only id to be stored, reveiws in seperate collection (look into it more on your own time)
    @DocumentReference
    private List<Review> reviewIds;
}
