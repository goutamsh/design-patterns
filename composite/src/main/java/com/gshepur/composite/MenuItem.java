package com.gshepur.composite;

public class MenuItem extends MenuComponent {

    public MenuItem(String name, String url) {
        super(name, url);
    }

    @Override
    public String showText() {
        return super.print();

    }
}
