package com.ms.java.day3;

import java.util.function.Function;

public class FunctionDemo {

    static Function<String, String> func = (name)-> name.toUpperCase();
    static Function<String, String> addStr = (name)-> name.toUpperCase().concat(" Srivastav");


    public static void main(String[] args) {
        System.out.println("Result is : "+func.apply("Abhishek"));
        System.out.println("Result of andThen: "+ func.andThen(addStr).apply("Shivani"));
        System.out.println("Result of compose: "+ func.compose(addStr).apply("Shivani"));
    }
}
