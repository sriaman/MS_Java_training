package com.ms.java.day2;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        Function<String,Integer> f = x->x.length();
        System.out.println(f.apply("Aman"));
    }
}
