package com.daniela.flixster.models;
import org.parceler.Parcel;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;
@Parcel
public class Movie {

    String backdropPath;
    String posterPath;
    String title;
    String overview;
    double rating;

    //required for parceler
    public Movie(){}

    //Create a movie out of a certain JSON object
    public Movie(JSONObject jsonObject) throws JSONException {
        backdropPath = jsonObject.getString("backdrop_path");
        posterPath = jsonObject.getString("poster_path");
        title = jsonObject.getString("title");
        overview = jsonObject.getString("overview");
        rating = jsonObject.getDouble("vote_average");
    }

    //Grab and add movies from the JSON to an array of movies
    public static List <Movie> fromJsonArray(JSONArray movieJsonArray) throws JSONException {
        List <Movie> movies = new ArrayList<>();
        for (int i=0; i<movieJsonArray.length(); i++){
            movies.add(new Movie(movieJsonArray.getJSONObject(i)));
        }
        return movies;
    }

    //Getters
    public String getBackdropPath() {
        return String.format("https://image.tmdb.org/t/p/w342%s", backdropPath);
    }
    public String getPosterPath() {
        return String.format("https://image.tmdb.org/t/p/w342%s", posterPath);
    }

    public String getTitle() {
        return title;
    }

    public String getOverview() {
        return overview;
    }

    public double getRating() {
        return rating;
    }
}
