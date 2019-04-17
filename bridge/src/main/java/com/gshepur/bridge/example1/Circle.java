package com.gshepur.bridge.example1;

public class Circle extends Shape {
    public Circle(Color color) {
        super(color);
    }

    @Override
    protected void applyColor() {
        System.out.print("Circle: ");
        this.color.applyCoulor();
    }
}
