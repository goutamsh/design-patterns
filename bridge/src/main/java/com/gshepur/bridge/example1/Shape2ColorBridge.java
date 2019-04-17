package com.gshepur.bridge.example1;


public class Shape2ColorBridge {
    public static void main(String[] args) {
        Color green = new Green();
        Color red = new Red();
        Color yellow = new Yellow();

        Shape greenSquare = new Square(green);
        Shape redSquare = new Square(red);

        Shape yellowCircle = new Circle(yellow);
        Shape redCircle = new Circle(red);

        greenSquare.applyColor();
        redSquare.applyColor();

        yellowCircle.applyColor();
        redCircle.applyColor();



    }
}
