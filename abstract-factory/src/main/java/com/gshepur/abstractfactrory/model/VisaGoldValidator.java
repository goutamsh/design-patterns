package com.gshepur.abstractfactrory.model;

public class VisaGoldValidator extends Validator {
    @Override
    public boolean isValid(CreditCard creditCard) {
        return false;
    }
}
