package com.ms.java.solidprinciples;

public class Crow implements FlyingBird {

    private String name;

    public Crow(String name) {
        this.name=name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isCanFly() {
        return true;
    }

    @Override
    public void fly() {
        System.out.println(getName()+" can flying");
    }
}
