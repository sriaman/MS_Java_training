package com.ms.java.day2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterListJava8 {
    public static void main(String[] args) {
        List<String> lst = Arrays.asList("abc", "xyz","aman");
        List<String> res = lst.stream().filter(z->z.equals("aman")).collect(Collectors.toList());
        res.forEach(System.out::println);
    }
}
