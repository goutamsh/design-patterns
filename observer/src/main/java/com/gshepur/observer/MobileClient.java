package com.gshepur.observer;

//Concrete Observer
public class MobileClient extends Observer {


    public MobileClient(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Mobile Client Showing message " + subject.getState());
    }

    public void postMessage(String message) {

        subject.setState(message);
    }
}
