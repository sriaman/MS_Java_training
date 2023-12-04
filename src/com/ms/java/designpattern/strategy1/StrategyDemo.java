package com.ms.java.designpattern.strategy1;

import java.time.LocalDate;

public class StrategyDemo {
     /* The Strategy pattern is based on the idea of encapsulating
           a family of algorithms into separate classes that implement
           a common interface. The pattern consists of three main components:
           the Context, the Strategy, and the Concrete Strategy.*/

    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        Item item1 = new Item(123,211);
        Item item2 = new Item(234,340);
        shoppingCart.addItem(item1);
        shoppingCart.addItem(item2);

        int total = shoppingCart.calculateAmount();

        shoppingCart.pay(new CreditCard("Aman",5662626262l,234, LocalDate.of(2030,12,1)));

        shoppingCart.pay(new UPI("aman@ybl"));
    }
}
