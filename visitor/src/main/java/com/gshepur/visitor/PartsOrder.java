package com.gshepur.visitor;

import java.util.ArrayList;
import java.util.List;

public class PartsOrder {

    private List<Part> parts = new ArrayList<>();

    public void addParts(Part part){
        parts.add(part);
    }

    public void accept(Visitor visitor){
        for (Part part: parts) {
            part.accept(visitor);
        }
        visitor.visit(this);
    }
}
