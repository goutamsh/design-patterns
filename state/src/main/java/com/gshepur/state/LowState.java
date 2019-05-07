package com.gshepur.state;

public class LowState extends State {
    public LowState(Fan fan) {
        super(fan);
    }

    @Override
    void handle() {
        System.out.println("Turning Fan to Medium");
        fan.setState(fan.getMedState());
    }
}
