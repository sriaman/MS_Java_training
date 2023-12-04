package com.ms.java.day2;

public interface Employee {
    void populate();
    default void display(){
        System.out.println("Hi There, Aman!");
    }
    default void process(){
        System.out.println("Hi There, Saket!");
    }
}
