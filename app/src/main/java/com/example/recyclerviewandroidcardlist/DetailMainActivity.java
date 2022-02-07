package com.example.recyclerviewandroidcardlist;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Icon;
import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailMainActivity extends AppCompatActivity {

    TextView textViewTitle, textViewRating, textViewGenre, textViewRelease, textViewDirector, textViewDescription;
    ImageView imageViewImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_main);

        textViewTitle = findViewById(R.id.tv_title);
        textViewRating = findViewById(R.id.tv_rating);
        textViewGenre = findViewById(R.id.tv_genre);
        textViewRelease = findViewById(R.id.tv_release);
        textViewDirector = findViewById(R.id.tv_director);
        textViewDescription = findViewById(R.id.tv_description);
        imageViewImg = findViewById(R.id.img_item);

        Movie movie = getIntent().getParcelableExtra("MOVIE");
        textViewTitle.setText(movie.getTitle());
        textViewRating.setText(String.valueOf(movie.getRating()));
        textViewGenre.setText(movie.getGenre());
        textViewRelease.setText(movie.getRelease());
        textViewDirector.setText(movie.getDirector());
        textViewDescription.setText(movie.getDescription());

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}