package com.gshepur.abstractfactrory.model;

public class AmexPlatinumValidator extends Validator {
    @Override
    public boolean isValid(CreditCard creditCard) {
        return false;
    }
}
