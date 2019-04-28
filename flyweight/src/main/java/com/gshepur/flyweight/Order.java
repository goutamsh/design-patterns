package com.gshepur.flyweight;

import org.apache.commons.lang3.builder.ToStringBuilder;
public class Order {

    private Item item;

    private int orderNo;

    public Order(Item item, int orderNo) {
        this.item = item;

        this.orderNo = orderNo;
    }


    public void processOrder(){
        System.out.println("Processing Order "+this.toString());
    }
    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
