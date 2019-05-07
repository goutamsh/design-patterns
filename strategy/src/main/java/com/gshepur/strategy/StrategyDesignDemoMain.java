package com.gshepur.strategy;

public class StrategyDesignDemoMain {

    public static void main(String[] args) {

        CreditCard creditCard = new CreditCard(new AmexCardValidation());
        creditCard.setCardNo("312344984928092");
        creditCard.setCcv("122");
        creditCard.setOwner("John");
        System.out.println("AmexCardValidation "+creditCard.isValid());

        CreditCard creditCard2 = new CreditCard(new VisaCardValidation());
        creditCard2.setCardNo("412344984928092");
        creditCard2.setCcv("122");
        creditCard2.setOwner("John");
        System.out.println("VisaCardValidation "+creditCard2.isValid());

    }
}
