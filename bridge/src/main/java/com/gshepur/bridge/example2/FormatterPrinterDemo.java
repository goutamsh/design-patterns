package com.gshepur.bridge.example2;

import java.text.Normalizer;

public class FormatterPrinterDemo {
    public static void main(String[] args) {
        Formatter plainTextFormatter = new PlainTextFormatter();
        Movie movie = new Movie();

        movie.setName("Jony English");
        movie.setRating("10");
        movie.setRuntime("2h");
        movie.setYear("2019");
        Printer printer = new MoviePrinter(movie);

        printer.print(plainTextFormatter);

        Formatter htmlFormatter = new HtmlFormatter();
        printer.print(htmlFormatter);
    }
}
