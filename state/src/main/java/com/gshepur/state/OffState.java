package com.gshepur.state;

public class OffState extends State {

    public OffState(Fan fan) {
        super(fan);
    }

    @Override
    public void handle() {
        System.out.println("Turning Fan to low");
        fan.setState(fan.getLowState());
    }
}
