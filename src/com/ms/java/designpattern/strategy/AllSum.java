package com.ms.java.designpattern.strategy;

import java.util.List;
import java.util.stream.Stream;

public class AllSum implements Sum{


    @Override
    public int sum(List<Integer> lstSum) {
        return lstSum.stream().reduce(0,(a,b)->a+b);
    }
}
