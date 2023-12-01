package com.ms.java.designpattern.strategy;

import java.util.List;

public class EvenSum implements Sum{
    @Override
    public int sum(List<Integer> lstSum) {
        return lstSum.stream().filter(a->a%2==0).reduce(0,Integer::sum);
    }
}
