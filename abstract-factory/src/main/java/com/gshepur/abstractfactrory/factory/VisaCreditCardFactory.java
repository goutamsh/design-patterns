package com.gshepur.abstractfactrory.factory;

import com.gshepur.abstractfactrory.model.*;

public class VisaCreditCardFactory extends CreditCardFactory {
    @Override
    public CreditCard createCreditCard(CardType cardType) {
        switch(cardType){
            case GOLD:
                return new VisaGoldCreditCard();
            case PLATINUM:
                return new VisalatinumCreditCard();
        }
        return null;
    }

    @Override
    public Validator createValidator(CardType cardType) {
        switch(cardType){
            case GOLD:
                return new VisaGoldValidator();
            case PLATINUM:
                return new VisaPlatinumValidator();
        }
        return null;
    }
}
