package com.gshepur.abstractfactrory.model;

public class AmexGoldValidator extends Validator {
    @Override
    public boolean isValid(CreditCard creditCard) {
        return false;
    }
}
