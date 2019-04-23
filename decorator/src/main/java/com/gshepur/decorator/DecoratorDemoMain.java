package com.gshepur.decorator;

public class DecoratorDemoMain {

    public static void main(String[] args) {
        Sandwitch sandwitch = new DressingDecorator(new MeatSandwitch(new SimpleSandwitch()));

        System.out.println(sandwitch.make());
    }
}
