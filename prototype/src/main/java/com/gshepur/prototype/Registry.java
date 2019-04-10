package com.gshepur.prototype;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Registry {

    private Map<EnumItemType, Item> items = new HashMap<>();

    public Registry(){
        loadItems();
    }

    private void loadItems() {

        Movie movie = new Movie();
        movie.setArtists(Arrays.asList("Yash", "Radhika", "Chikkanna"));
        movie.setGenre("Comedy");
        movie.setPrice(100);
        movie.setTitle("Mr & Mrs Ramachari");
        items.put(EnumItemType.MOVIE, movie);

        Book book = new Book();
        book.setAuthor("Robin Sharma");
        book.setIsbn("123");
        book.setNoOfPages(120);
        book.setPrice(400);
        book.setTitle("The Monk Who Sold His Ferrari");
        items.put(EnumItemType.BOOK, book);
    }



    public Item createItem(EnumItemType type){

        try{
            return (Item) (items.get(type)).clone();
        }catch (CloneNotSupportedException e){

        }
        return null;
    }
}
