package com.ms.java.day5;

import java.util.stream.IntStream;

public class SumMain {
    public static void main(String[] args) {
        Sum sum =  new Sum();
        IntStream.rangeClosed(1,1000).forEach(sum::performSum); //result could 500500

        //System.out.println(sum.getTotal());
        //IntStream.rangeClosed(1,1000).parallel().forEach(sum::performSum); //result could 500500

        System.out.println(sum.getTotal());
    }
}
