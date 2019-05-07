package com.gshepur.observer;

import java.util.ArrayDeque;
import java.util.Deque;

//Concrete Subject
public class MessageStream extends Subject {

    private Deque<String> messageHistrory = new ArrayDeque<>();

    @Override
    public String getState() {
        return messageHistrory.getLast();
    }

    @Override
    public void setState(String message) {

        messageHistrory.add(message);
        super.notifyObservers();
    }
}
