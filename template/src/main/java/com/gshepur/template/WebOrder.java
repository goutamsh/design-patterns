package com.gshepur.template;

public class WebOrder extends OrderTemplate{
    @Override
    protected void doDelivery() {
        System.out.println("Deliver items to mentioned address");
    }

    @Override
    protected void doReceipt() {
        System.out.println("Email the receipt to customer");
    }

    @Override
    protected void doPayment() {
        System.out.println("Make payment online");
    }

    @Override
    protected void doCheckout() {

        System.out.println("Add items to Cart");
        System.out.println("Select gift preferences");
        System.out.println("Mention the delivery address");
        System.out.println("Mention the billing address");
    }
}
