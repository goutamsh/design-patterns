package com.gshepur.state;

public abstract class State {

    protected Fan fan;

    public State(Fan fan){
        this.fan = fan;
    }
    abstract void handle();
}
