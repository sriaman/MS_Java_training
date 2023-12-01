package com.ms.java.designpattern.strategy;

import java.util.List;
import java.util.stream.Stream;

public class EvenSum implements Sum{
    @Override
    public int sum(List<Integer> lstSum) {
        return lstSum.stream().filter(a->a%2==0).reduce(0,(a,b)->a+b);
    }
}
