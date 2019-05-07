package com.gshepur.observer;

//Concrete Observer
public class TabletClient extends Observer {


    public TabletClient(Subject messageSteam) {
        this.subject = messageSteam;
        messageSteam.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Tablet Client showing message "+subject.getState());
    }

    public void postMessage(String message){
        subject.setState(message);
    }
}
