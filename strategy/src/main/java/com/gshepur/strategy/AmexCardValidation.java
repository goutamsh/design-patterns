package com.gshepur.strategy;

public class AmexCardValidation implements ValidationStrategy {

    @Override
    public boolean validate(CreditCard creditCard) {
        return creditCard.getCardNo().startsWith("31") || creditCard.getCardNo().startsWith("32");
    }
}
