package com.ms.java.designpattern.strategy1;

import java.time.LocalDate;
public class CreditCard implements PaymentMethod{

    private String name;
    private long cardNumber;
    private int cvv;
    private LocalDate expiryDate;
    CreditCard(String name,long cardNumber,int cvv,LocalDate expiryDate){
        this.name=name;
        this.cvv=cvv;
        this.cardNumber=cardNumber;
        this.expiryDate=expiryDate;
    }
    @Override
    public void pay(int amount) {
        System.out.println(amount+" has been successfully paid through Credit/Debit card");
    }
}
