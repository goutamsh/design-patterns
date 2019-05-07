package com.gshepur.state;

public class HighState extends State {
    public HighState(Fan fan) {
        super(fan);
    }

    @Override
    void handle() {
        System.out.println("Turning Fan Off");
        fan.setState(fan.getOffState());
    }
}
