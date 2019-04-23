package com.gshepur.composite;

import java.util.ArrayList;
import java.util.List;

public class Menu extends MenuComponent {

    private List<MenuComponent> menuComponents = new ArrayList<>();

    public Menu(String name, String url) {
        super(name, url);
    }

    @Override
    public String showText() {

        StringBuilder sb = new StringBuilder();
        sb.append(super.print())
                .append(">>>").append("\n");

        for (MenuComponent menuComp:menuComponents) {
            sb.append(menuComp.showText())
                    .append("\n");
        }
        return sb.toString();


    }

    @Override
    public void add(MenuComponent menuComponent){
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent){
        menuComponents.remove(menuComponent);
    }
}
