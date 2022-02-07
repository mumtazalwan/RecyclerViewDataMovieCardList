package com.example.recyclerviewandroidcardlist;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieViewHolder> {
    ArrayList<Movie> arrayListMovie;

    public MovieAdapter(ArrayList<Movie> arrayListMovie) {
        this.arrayListMovie = arrayListMovie;
    }

    @NonNull
    @Override
    public MovieAdapter.MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        return new MovieViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieAdapter.MovieViewHolder holder, int position) {
        final Movie movie = arrayListMovie.get(position);

        holder.textViewTitle.setText(movie.getTitle());
        holder.textViewRating.setText(String.valueOf(movie.getRating()));
        holder.textViewGenre.setText(movie.getGenre());
        holder.textViewRelease.setText(movie.getRelease());
        holder.imageViewImg.setImageResource(movie.getImg());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(holder.itemView.getContext(), DetailMainActivity.class);
                intent.putExtra("MOVIE", movie);
                holder.itemView.getContext().startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return arrayListMovie.size();
    }

    public class MovieViewHolder extends RecyclerView.ViewHolder {
        TextView textViewTitle, textViewRating, textViewGenre, textViewRelease;
        ImageView imageViewImg;

        public MovieViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewTitle = itemView.findViewById(R.id.tv_title);
            textViewRating = itemView.findViewById(R.id.tv_rating);
            textViewGenre = itemView.findViewById(R.id.tv_genre );
            textViewRelease = itemView.findViewById(R.id.tv_release);
            imageViewImg = itemView.findViewById(R.id.img_item);
        }
    }
}
