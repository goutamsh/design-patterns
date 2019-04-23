package com.gshepur.decorator;

public class DressingDecorator extends SandwitchDecorator {

    public DressingDecorator(Sandwitch sandwitch) {
        super(sandwitch);
    }

    @Override
    public String make() {
        return sandwitch.make() + "+" + addDressing();
    }

    private String addDressing() {
        return "Ketchup";
    }
}
