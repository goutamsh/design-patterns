package com.gshepur.visitor;

//Visitor interface
public interface Visitor {
    void visit(Part part);

    void visit(PartsOrder partsOrder);
}
