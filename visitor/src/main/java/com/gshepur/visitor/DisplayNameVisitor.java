package com.gshepur.visitor;

//Concrete Visitor
public class DisplayNameVisitor implements Visitor{
    @Override
    public void visit(Part part) {
        System.out.println(part.getDisplayName());
    }

    @Override
    public void visit(PartsOrder partsOrder) {

        //Do nothing
    }
}
