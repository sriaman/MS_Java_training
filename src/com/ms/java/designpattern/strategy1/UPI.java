package com.ms.java.designpattern.strategy1;

public class UPI implements PaymentMethod{

    private String upiId;

    public UPI(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount+" has been paid through UPI.");
    }
}
