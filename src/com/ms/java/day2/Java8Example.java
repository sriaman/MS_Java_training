package com.ms.java.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8Example {

    public static void main(String[] args) {

        Stream<Integer> s1 = Stream.of(10,20,30,40,50,60);
//        s1.forEach(System.out::println);
        Stream<Integer> s2 = Stream.of(new Integer[]{10,20,30,40,50,60});
//        s2.forEach(System.out::print);\
        ArrayList<Integer> l1 = new ArrayList<>(Arrays.asList(10,15,25,45,50));
//        System.out.println(l1);
        Stream<Integer> s3 = l1.stream();
//        s3.forEach(System.out::println);
        Stream<Date> date =Stream.generate(()-> { return  new Date();});
//        date.forEach(System.out::println);
        Stream<String> s4 = Stream.of("A$B$C".split("\\$"));
//        s4.forEach(System.out::println);

        List<Integer> l2 = s3.filter(i->i%2==0).collect(Collectors.toList());
//        System.out.println(l2);

        List<String> names = new ArrayList<>(Arrays.asList("abc", "efg", "hij","auyh","hdg"));
//        names.stream().filter(p->p.startsWith("a")).forEach(System.out::println);

//        names.stream().filter(p->p.startsWith("a")).map(String::toLowerCase).forEach(System.out::println);

//        names.stream().filter(p->p.startsWith("a")).map(String::toLowerCase).forEach(System.out::println);

//        names.stream().sorted().map(String::toUpperCase).forEach(System.out::println);



    }
}
