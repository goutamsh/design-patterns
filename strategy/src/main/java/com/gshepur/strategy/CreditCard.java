package com.gshepur.strategy;

public class CreditCard {

    private String cardNo;
    private String ccv;
    private String owner;

    private ValidationStrategy validationStrategy;


    public CreditCard(ValidationStrategy validationStrategy){
        this.validationStrategy = validationStrategy;
    }



    public boolean isValid(){
        return validationStrategy.validate(this);
    }

    public String getCardNo() {
        return cardNo;
    }

    public String getCcv() {
        return ccv;
    }

    public String getOwner() {
        return owner;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public void setCcv(String ccv) {
        this.ccv = ccv;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setValidationStrategy(ValidationStrategy validationStrategy) {
        this.validationStrategy = validationStrategy;
    }
}
