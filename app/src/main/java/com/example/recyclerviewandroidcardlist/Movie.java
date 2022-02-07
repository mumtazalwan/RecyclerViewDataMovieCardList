package com.example.recyclerviewandroidcardlist;

import android.os.Parcel;
import android.os.Parcelable;

public class Movie implements Parcelable {
    private String title;
    private Double rating;
    private String genre;
    private String release;
    private String director;
    private String description;
    private int img;



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getRelease() {
        return release;
    }

    public void setRelease(String release) {
        this.release = release;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public Movie(String title, Double rating, String genre, String release, String director, String description, int img) {
        this.title = title;
        this.rating = rating;
        this.genre = genre;
        this.release = release;
        this.director = director;
        this.description = description;
        this.img = img;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.title);
        dest.writeValue(this.rating);
        dest.writeString(this.genre);
        dest.writeString(this.release);
        dest.writeString(this.director);
        dest.writeString(this.description);
        dest.writeInt(this.img);
    }

    public void readFromParcel(Parcel source) {
        this.title = source.readString();
        this.rating = (Double) source.readValue(Double.class.getClassLoader());
        this.genre = source.readString();
        this.release = source.readString();
        this.director = source.readString();
        this.description = source.readString();
        this.img = source.readInt();
    }

    protected Movie(Parcel in) {
        this.title = in.readString();
        this.rating = (Double) in.readValue(Double.class.getClassLoader());
        this.genre = in.readString();
        this.release = in.readString();
        this.director = in.readString();
        this.description = in.readString();
        this.img = in.readInt();
    }

    public static final Parcelable.Creator<Movie> CREATOR = new Parcelable.Creator<Movie>() {
        @Override
        public Movie createFromParcel(Parcel source) {
            return new Movie(source);
        }

        @Override
        public Movie[] newArray(int size) {
            return new Movie[size];
        }
    };
}
