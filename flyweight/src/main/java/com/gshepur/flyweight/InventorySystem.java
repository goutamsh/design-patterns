package com.gshepur.flyweight;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InventorySystem {

    private Catalog catalog = new Catalog();

    private List<Order> orderList = new ArrayList<>();



    public void placeOrder(String name, String desc, int orderNo){

        orderList.add(new Order(catalog.lookup(name, desc), orderNo));
    }

    public void processOrders(){
        for (Iterator<Order> orderIterator = orderList.iterator(); orderIterator.hasNext();) {
            Order order = orderIterator.next();
            order.processOrder();
            orderIterator.remove();
        }
    }

    public
    int InventorySystemReport(){
        return catalog.getReport();
    }
}
