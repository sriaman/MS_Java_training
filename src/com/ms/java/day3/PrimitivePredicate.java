package com.ms.java.day3;

import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;

public class PrimitivePredicate {

    static IntPredicate p1 = x->x%2==0;
    static DoublePredicate d1 = x->x%2.0==0;

    public static void main(String[] args) {
        System.out.println(p1.test(3));
        System.out.println(d1.test(4.0));
    }
}
