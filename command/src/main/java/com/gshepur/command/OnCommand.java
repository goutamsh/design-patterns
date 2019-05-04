package com.gshepur.command;

//Concrete Command Class
public class OnCommand implements Command {

    private Light light;

    OnCommand(Light light){
        this.light = light;
    }
    @Override
    public void execute() {
        light.on();
    }
}
