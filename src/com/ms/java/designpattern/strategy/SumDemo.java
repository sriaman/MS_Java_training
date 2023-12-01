package com.ms.java.designpattern.strategy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumDemo {


    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        SumService sumService = new SumService(lst);

        sumService.userSum(new AllSum());
        sumService.userSum(new EvenSum());
        sumService.userSum(new OddSum());
        sumService.userSum(new PrimeSum());

    }




}
