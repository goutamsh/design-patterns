package com.gshepur.command;

//Reciever
public class Light {

    private boolean isOn;

    public Light(){
        isOn = false;
    }

    void toggle(){
        if(isOn){
            off();
        }else {
            on();
        }
    }
    public void on() {
        isOn = true;
        System.out.println("Light switched On");
    }

    public void off(){
        isOn = false;
        System.out.println("Light switched Off");
    }

    public boolean isOn() {
        return isOn;
    }
}
