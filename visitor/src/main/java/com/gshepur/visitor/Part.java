package com.gshepur.visitor;

//Element
public interface Part {
    void accept(Visitor visitor);
    String getDisplayName();
    double getPrice();

}
