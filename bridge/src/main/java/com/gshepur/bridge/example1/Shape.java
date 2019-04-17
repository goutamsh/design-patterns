package com.gshepur.bridge.example1;

public abstract class Shape {

    protected Color color;

    public Shape(Color color){
        this.color = color;
    }

    protected abstract void applyColor();
}
