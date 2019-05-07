package com.gshepur.state;

public class MedState extends State {
    public MedState(Fan fan) {
        super(fan);
    }

    @Override
    void handle() {
        System.out.println("Turning Fan to High");
        fan.setState(fan.getHighState());
    }
}
