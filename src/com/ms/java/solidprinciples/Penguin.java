package com.ms.java.solidprinciples;

public class Penguin implements NonFlyingBird {

    private String name;
    public Penguin(String name) {
        this.name=name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isCanFly() {
        return false;
    }

    @Override
    public void notFly() {
        System.out.println(name+ " can't fly");
    }
}
