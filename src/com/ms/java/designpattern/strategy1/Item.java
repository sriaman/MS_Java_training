package com.ms.java.designpattern.strategy1;

public class Item {

    private int itemId;
    private int cost;

    public Item(int itemId, int cost) {
        this.itemId = itemId;
        this.cost = cost;
    }

    public int getItemId() {
        return itemId;
    }

    public int getCost() {
        return cost;
    }
}
