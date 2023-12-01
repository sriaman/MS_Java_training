package com.ms.java.solidprinciples;

public class BirdDemo {
    public static void main(String[] args) {
        Crow crow = new Crow("Crow");
        crow.fly();

        Penguin penguin = new Penguin("Penguin");
        penguin.notFly();

        Parrot parrot = new Parrot("Parrot");
        parrot.fly();
    }
}
