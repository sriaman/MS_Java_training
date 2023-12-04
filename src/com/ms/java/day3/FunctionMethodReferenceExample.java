package com.ms.java.day3;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class FunctionMethodReferenceExample {

    /**
     * Class::instancemethod
     */
    static Function<String,String> toUpperCaseLambda = (s)->s.toUpperCase();

    static Function<String,String> toUpperCaseMethodReference = String::toUpperCase;

    public static void main(String[] args) {

        System.out.println(toUpperCaseLambda.apply("java8"));

        System.out.println(toUpperCaseMethodReference.apply("java8"));


    }
}
