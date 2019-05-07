package com.gshepur.template;

public abstract class OrderTemplate {

    private boolean isGift;

    public void processOrder(){
        doCheckout();
        doPayment();
        if(isGift){
            wrapGift();
        }else{
            doReceipt();
        }
        doDelivery();
    }

    protected abstract void doDelivery();

    protected abstract void doReceipt();

    private void wrapGift() {
        System.out.println("Wrap Gift");
    }

    protected abstract void doPayment();

    protected abstract void doCheckout();
}
