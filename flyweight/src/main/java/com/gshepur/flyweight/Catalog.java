package com.gshepur.flyweight;

import java.util.HashMap;
import java.util.Map;

public class Catalog {

    Map<String, Item> items = new HashMap<>();

    public Item lookup(String name, String description){
        if(!items.containsKey(name)){
            items.put(name, new Item(name, description));
        }
        return items.get(name);
    }

    public int getReport(){
        return items.size();
    }
}
