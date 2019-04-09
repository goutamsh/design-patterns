package com.gshepur.builder;

public class BuilderDemo {
    public static void main(String[] args) {
        LunchOrder.Builder builder = new LunchOrder.Builder();

        builder.bread("Wheat").condiments("letteuce").dressing("ketchup").meat("fish");
        LunchOrder lunchOrder = builder.build();

        System.out.println("LunchOrder bread"+lunchOrder.getBread());
        System.out.println("LunchOrder condiments"+lunchOrder.getCondiments());
        System.out.println("LunchOrder dressing"+lunchOrder.getDressing());
        System.out.println("LunchOrder meat"+lunchOrder.getMeat());
    }
}
