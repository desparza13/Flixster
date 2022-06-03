package com.daniela.flixster;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.daniela.flixster.models.Movie;

import org.parceler.Parcels;

public class DetailActivity extends AppCompatActivity{
    Movie movie;
    TextView tvDetailTitle;
    ImageView ivDetail;
    RatingBar rbRating;
    TextView tvOverview;

    public void onCreate(Bundle savedinstanceState) {
        super.onCreate(savedinstanceState);
        setContentView(R.layout.activity_detail);
        //Get elements
        tvDetailTitle = findViewById(R.id.tvDetailTitle);
        tvOverview = findViewById(R.id.tvOverview);
        rbRating = findViewById(R.id.rbRating);
        ivDetail = findViewById(R.id.ivDetail);

        //Set elements
        Movie movie = (Movie) Parcels.unwrap(getIntent().getParcelableExtra(Movie.class.getSimpleName()));
        Log.d("MovieDetailsActivity", String.format("Showing details for '%s'",movie.getTitle()));
        tvDetailTitle.setText(movie.getTitle());
        tvOverview.setText(movie.getOverview());
        rbRating.setRating((float) movie.getRating());
        String imageUrl;
        int placeholder;
        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            //backdrop image
            imageUrl = movie.getBackdropPath();
            placeholder = R.drawable.flicks_backdrop_placeholder;
        }
        else {
            imageUrl = movie.getPosterPath();
            placeholder = R.drawable.flicks_movie_placeholder;
        }
        int radius = 30; // corner radius, higher value = more rounded
        Glide.with(this).load(imageUrl).placeholder(placeholder).error(placeholder).transform(new RoundedCorners(radius))
                .into(ivDetail);
    }

}
