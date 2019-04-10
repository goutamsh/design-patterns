package com.gshepur.prototype;

public class PrototypeDemo {

    public static void main(String[] args) {

        Registry registry = new Registry();

        Movie movie1 = (Movie) registry.createItem(EnumItemType.MOVIE);
        movie1.setTitle("KGF Lesson 1");

        System.out.println(movie1);

        Movie movie2 = (Movie) registry.createItem(EnumItemType.MOVIE);
        movie2.setTitle("KGF Lesson 2");

        System.out.println(movie2);

    }
}
