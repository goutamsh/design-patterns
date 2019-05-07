package com.gshepur.observer;

//Observer
public abstract class Observer {
    protected Subject subject;
    abstract void update();
}
