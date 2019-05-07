package com.gshepur.template;

public class TemplateDesignDemoMain {
    public static void main(String[] args) {

        System.out.println("WebOrder : ");
        OrderTemplate webOrder = new WebOrder();
        webOrder.processOrder();
        System.out.println("StoreOrder : ");
        OrderTemplate storeOrder = new StoreOrder();
        storeOrder.processOrder();
    }
}
