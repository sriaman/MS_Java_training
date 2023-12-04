package com.ms.java.designpattern.strategy1;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> items;

    public ShoppingCart() {
        this.items = new ArrayList<Item>();
    }

    public void addItem(Item item){
        items.add(item);
    }

    public void removeItem(Item item){
        this.items.remove(item);
    }

    public int calculateAmount(){
        int sum=0;
        for(Item item:items){
            sum+=item.getCost();
        }
        return sum;
    }

    public void pay(PaymentMethod paymentMethod){
        int amount = calculateAmount();
        paymentMethod.pay(amount);

    }
}
