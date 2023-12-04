package com.ms.java.day2;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class JavaMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"aman.com");
        map.put(2,"saket.com");
        map.put(3,"saket1.com");
        map.put(4,"saket12.com");
        map.put(5,"saket123.com");

        Map<Integer,String> res = map.entrySet().stream().filter(x->x.getKey()==1).collect(Collectors.toMap(p->p.getKey(),p->p.getValue()));

        System.out.println(res);
    }
}
