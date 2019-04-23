package com.gshepur.decorator;

public abstract class SandwitchDecorator implements Sandwitch{

    protected Sandwitch sandwitch;

    public SandwitchDecorator(Sandwitch sandwitch){
        this.sandwitch = sandwitch;
    }

    @Override
    public String make() {
        return sandwitch.make();
    }
}
