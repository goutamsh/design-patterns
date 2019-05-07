package com.gshepur.visitor;

//Concrete Visitor
public class TotalCostFinderVisitor implements Visitor {

    private double totalCost;
    @Override
    public void visit(Part part) {
        totalCost+=part.getPrice();
    }

    @Override
    public void visit(PartsOrder partsOrder) {

        System.out.println("Total price of Order "+totalCost);
    }
}
