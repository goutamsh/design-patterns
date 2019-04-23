package com.gshepur.composite;

import java.util.Objects;

public abstract class MenuComponent {

    private String name;

    private String url;

    public MenuComponent(String name, String url){
        this.name = name;
        this.url = url;
    }

    public abstract String showText();

    @Override
    public int hashCode() {
        return java.util.Objects.hash(name, url);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this){
            return true;
        }
        if(obj instanceof MenuComponent){

            MenuComponent menuComponent = (MenuComponent)obj;
            return Objects.equals(name, menuComponent.name) && Objects.equals(url, menuComponent.url);
        }

        return false;
    }

    protected String print() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append("(").append(url).append(")");
        return sb.toString();
    }

    //By default throws unsupported exception
    public void add(MenuComponent menuComponent){
        throw new UnsupportedOperationException("Not Supported");
    }

    //By default throws unsupported exception
    public void remove(MenuComponent menuComponent){
        throw new UnsupportedOperationException("Not Supported");
    }
}
