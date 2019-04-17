package com.gshepur.bridge.example1;

public class Square extends Shape {
    public Square(Color color) {
        super(color);
    }

    @Override
    protected void applyColor() {
        System.out.print("Square: ");
        this.color.applyCoulor();
    }
}
