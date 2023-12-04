package com.ms.java.day5.combinatorpattern;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Lambdas {

    public static void main(String[] args) {

        //int counter=0;

        Function<String,String> uppercasename = (name)->{
            if(name.isBlank()) throw new IllegalArgumentException("");
            return name.toUpperCase();
        };
        System.out.println(uppercasename.apply("Aman"));
        BiFunction<String,Integer,String> upperCaseName = (name, age)->{
            //int counter=0;
            if(name.isBlank()) throw new IllegalArgumentException("");
            System.out.println(age);
            return name.toUpperCase();
        };
        System.out.println(upperCaseName.apply("Aman",20));
    }
}
