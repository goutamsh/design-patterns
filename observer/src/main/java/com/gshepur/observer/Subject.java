package com.gshepur.observer;

import java.util.ArrayList;
import java.util.List;

//Subject
public abstract class Subject {

    private List<Observer> observers = new ArrayList<>();

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void remove(Observer observer){
        observers.remove(observer);
    }

    public void notifyObservers(){
        for (Observer observer: observers) {
            observer.update();
        }
    }

    public abstract String getState();

    public abstract void setState(String message);

}
