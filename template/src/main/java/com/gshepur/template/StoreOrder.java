package com.gshepur.template;

public class StoreOrder extends OrderTemplate{
    @Override
    protected void doDelivery() {
        System.out.println("Bag items at the counter");
    }

    @Override
    protected void doReceipt() {
        System.out.println("Print receipt");
    }

    @Override
    protected void doPayment() {
        System.out.println("Make payment by presenting the card");
    }

    @Override
    protected void doCheckout() {
        System.out.println("Take items to buy to the counter");
    }
}
