package com.gshepur.bridge.example2;

import java.util.ArrayList;
import java.util.List;

public class MoviePrinter extends Printer {

    private Movie movie;
    public MoviePrinter(Movie movie) {
        this.movie = movie;
    }

    @Override
    protected String getHeader() {
        return movie.getName();
    }

    @Override
    protected List<Detail> getDetails() {
        List<Detail> details = new ArrayList<>();
        details.add((new Detail("Runtime", movie.getRuntime())));
        details.add((new Detail("Year", movie.getYear())));
        details.add((new Detail("Rating", movie.getRating())));
        return details;
    }
}
