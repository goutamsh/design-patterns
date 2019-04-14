package com.gshepur.abstractfactrory.model;

public class VisaPlatinumValidator extends Validator {
    @Override
    public boolean isValid(CreditCard creditCard) {
        return false;
    }
}
