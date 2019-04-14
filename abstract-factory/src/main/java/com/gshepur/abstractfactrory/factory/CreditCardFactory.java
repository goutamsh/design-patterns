package com.gshepur.abstractfactrory.factory;

import com.gshepur.abstractfactrory.model.CardType;
import com.gshepur.abstractfactrory.model.CreditCard;
import com.gshepur.abstractfactrory.model.Validator;

public abstract class CreditCardFactory {


    public static CreditCardFactory getCreditCardFactory(int crditScore){
        if(crditScore > 500){
            return new AmexCreditCardFactory();
        }else{
            return new VisaCreditCardFactory();
        }
    }

    public abstract CreditCard createCreditCard(CardType cardType);

    public abstract Validator createValidator(CardType cardType);
}
