package com.ms.java.designpattern.strategy;

import java.util.List;
import java.util.function.Predicate;

public class PrimeSum implements Sum{
    @Override
    public int sum(List<Integer> lstSum) {
        Predicate<Integer> p = a->{
            if(a<=1)
                return false;
            for(int i=2;i<=Math.sqrt(a);i++)
                if(a%i==0)
                    return false;
            return true;
        };
        return lstSum.stream().filter(p).reduce(0,Integer::sum);
    }
}
