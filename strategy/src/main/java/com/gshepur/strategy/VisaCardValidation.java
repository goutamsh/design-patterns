package com.gshepur.strategy;

public class VisaCardValidation implements ValidationStrategy {
    @Override
    public boolean validate(CreditCard creditCard) {
        return creditCard.getCardNo().startsWith("41") || creditCard.getCardNo().startsWith("42");
    }
}
