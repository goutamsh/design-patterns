package com.gshepur.abstractfactrory.factory;

import com.gshepur.abstractfactrory.model.*;

public class AmexCreditCardFactory extends CreditCardFactory {

    @Override
    public CreditCard createCreditCard(CardType cardType) {
        switch(cardType){
            case GOLD:
                return new AmexGoldCreditCard();
            case PLATINUM:
                return new AmexPlatinumCreditCard();
        }
        return null;
    }

    @Override
    public Validator createValidator(CardType cardType) {
        switch(cardType){
            case GOLD:
                return new AmexGoldValidator();
            case PLATINUM:
                return new AmexPlatinumValidator();
        }
        return null;
    }

}
