package com.ms.java.designpattern.strategy;

import java.util.List;

public class AllSum implements Sum{


    @Override
    public int sum(List<Integer> lstSum) {
        return lstSum.stream().reduce(0,Integer::sum);
    }
}
