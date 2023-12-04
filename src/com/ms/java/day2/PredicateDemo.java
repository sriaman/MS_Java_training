package com.ms.java.day2;

import java.util.function.Predicate;

public class PredicateDemo {

    public static void main(String[] args) {

        Predicate<Integer> p = a->a>30;
        System.out.println(p.test(40));
        System.out.println(p.test(23));

        Predicate<String> predicate = x->x.length()>10;
        System.out.println(predicate.test("aman Srivastav"));

        //Predicate Joins
        int[] x = {10,20,30,40,50,60,79,82,76};
        Predicate<Integer> p2 = x1->x1  >40;
        Predicate<Integer> p3 = y->y%2==1;
        System.out.println("Greater then 40");
        func1(p2,x);
        System.out.println();
        System.out.println("Odd");
        func1(p3,x);
        System.out.println();
        System.out.println("Even");
        func1(p3.negate(),x);
        System.out.println();
        System.out.println("Greater than 40 and Odd");
        func1(p3.and(p2),x);

    }
    static void func1(Predicate<Integer> pre,int[] x){
        for(int a:x){
            if(pre.test(a)){
                System.out.print(a+" ");
            }
        }

    }
}
