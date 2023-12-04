package com.ms.java.day2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterList {
    public static void main(String[] args) {
        List<String> lst = Arrays.asList("aman", "saket", "harsh");
        f1(lst,"aman");

    }
    private static List<String> f1(List<String> x, String msg){
        List<String> lst = new ArrayList<>();
        for(String str:x){
            if(!"aman".equals(str)){
                lst.add(str);
            }
        }
        return lst;
    }
}
