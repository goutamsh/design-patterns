package com.gshepur.decorator;

public class MeatSandwitch extends SandwitchDecorator {

    public MeatSandwitch(Sandwitch sandwitch) {
        super(sandwitch);
    }

    @Override
    public String make() {
        return sandwitch.make() + "+" + addMeat();
    }

    private String addMeat() {
        return "Meat";
    }
}
