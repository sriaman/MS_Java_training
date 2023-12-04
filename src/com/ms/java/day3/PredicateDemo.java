package com.ms.java.day3;

import java.util.function.Predicate;

public class PredicateDemo {

    static Predicate<Integer> predicate = (x)-> x%2==0;
    static Predicate<Integer> predicate2 = (x)-> x%2!=0;
    static Predicate<Integer> predicate3 = (x)-> x%5==0;

    public static void predicateAnd(){
        System.out.println("Result using and are : " +predicate.and(predicate2).test(10));
    }

    public static void predicateOr(){
        System.out.println("Result using or are : " +predicate2.or(predicate3).test(4));
    }

    public static void predicateNegate(){
        System.out.println("Result using or are : " +predicate2.or(predicate3).negate().test(4));
    }
    public static void main(String[] args) {

        System.out.println(predicate.test(10));
        System.out.println(predicate2.test(2));
        System.out.println(predicate3.test(5));

        predicateAnd();
        predicateOr();
        predicateNegate();
    }
}
