package com.gshepur.visitor;

public class VisitorDesignDemo {
    public static void main(String[] args) {

        PartsOrder partsOrder = new PartsOrder();
        partsOrder.addParts(new Wheel(10, "123"));
        partsOrder.addParts(new Steering(11, "456"));
        partsOrder.addParts(new Engine(30, "789"));

        partsOrder.accept(new TotalCostFinderVisitor());
        partsOrder.accept(new DisplayNameVisitor());
    }
}
