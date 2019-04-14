package com.gshepur.abstractfactrory;

import com.gshepur.abstractfactrory.factory.CreditCardFactory;
import com.gshepur.abstractfactrory.model.CardType;
import com.gshepur.abstractfactrory.model.CreditCard;

public class AbstractFactoryDemoMain {
    public static void main(String[] args) {
        CreditCardFactory abstractFactory = CreditCardFactory.getCreditCardFactory(400);
        CreditCard creditCard = abstractFactory.createCreditCard(CardType.GOLD);
        System.out.println(creditCard);

        CreditCardFactory abstractFactory2 = CreditCardFactory.getCreditCardFactory(700);
        CreditCard creditCard2 = abstractFactory2.createCreditCard(CardType.GOLD);
        System.out.println(creditCard2);

    }
}
