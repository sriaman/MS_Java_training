package com.ms.java.designpattern.strategy;


import java.util.List;

public class SumService {

    private final List<Integer> lst;
    public SumService(List<Integer> lst) {
        this.lst = lst;
    }

    public void userSum(Sum sum){
        System.out.println(sum.sum(lst));
    }
}
