package com.ms.java.solidprinciples;

public class Parrot implements FlyingBird{

    private String name;
    public Parrot(String name) {
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
        System.out.println(name+" can fly");
    }
}
