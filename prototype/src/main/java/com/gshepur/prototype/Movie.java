package com.gshepur.prototype;

import java.util.List;

public class Movie extends Item {

    private String genre;

    private List<String> artists;

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public List<String> getArtists() {
        return artists;
    }

    public void setArtists(List<String> artists) {
        this.artists = artists;
    }

    @Override
    public String toString() {
        return "Movie : [ genre:"+genre+", artists:"+artists+", "+super.toString()+"]";
    }
}
