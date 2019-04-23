package com.gshepur.composite;

public class CompositeDemoMain {

    public static void main(String[] args) {

        MenuComponent mainMenu = new Menu("Main", "/main");

        MenuComponent csMenu = new Menu("ComputerScience", "/ComputerScience");
        ((Menu) csMenu).add(new MenuItem("Java", "/java"));
        ((Menu) csMenu).add(new MenuItem("C++", "/c++"));
        ((Menu) csMenu).add(new MenuItem("Python", "/python"));

        ((Menu) mainMenu).add(csMenu);

        ((Menu) mainMenu).add(new MenuItem("Electronics", "/electronics"));
        ((Menu) mainMenu).add(new MenuItem("Civil", "/civil"));

        MenuComponent mechMenu = new Menu("Mechanics", "/mechanics");
        ((Menu) mechMenu).add(new MenuItem("Thermo", "/Thermo"));
        ((Menu) mechMenu).add(new MenuItem("CarRepair", "/CarRepair"));
        ((Menu) mainMenu).add(mechMenu);
        System.out.println(mainMenu.showText());

    }
}
