package com.gshepur.visitor;

//Concrete Element
public class Engine implements Part {

    private double price;
    private String barCode;

    public Engine(double price, String barCode){
        this.price = price;
        this.barCode = barCode;
    }

    @Override
    public double getPrice() {
        return price;
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getDisplayName() {
        return "Engine";
    }
}
