package com.ms.java.day3;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorDemo {

    static Comparator<Integer> bo= (a, b)->a.compareTo(b);

    public static void main(String[] args) {

        BinaryOperator<Integer> binaryOperator = (a,b)->a*b;
        System.out.println(binaryOperator.apply(10,20));

        BinaryOperator<Integer> res = BinaryOperator.maxBy(bo);
        System.out.println(res.apply(10,20));
    }
}