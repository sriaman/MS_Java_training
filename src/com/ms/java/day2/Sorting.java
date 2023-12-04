package com.ms.java.day2;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Sorting {

    public static void main(String[] args) {
        List<Developer> lst = getDevelopers();
//        lst.stream().sorted(Comparator.comparing(x->x.getAge())).forEach(System.out::println);
//        lst.stream().sorted(Comparator.comparing(Developer::getAge).thenComparing(Developer::getSalary)).forEach(System.out::println);

        lst.sort((o1,o2)->{
            return o1.getAge()-o2.getAge();
        });
        lst.forEach(x->System.out.println(x));

        //sorting in reverse order
        Comparator<Developer> salaryComp = (o1,o2)->o1.getSalary().compareTo(o2.getSalary());

    }

    static List<Developer> getDevelopers(){
        List<Developer> lst = new ArrayList<>();
        lst.add(new Developer("Aman", new BigDecimal("100002"),27));
        lst.add(new Developer("Saket", new BigDecimal("100003"),22));
        lst.add(new Developer("Harsh", new BigDecimal("100233"),22));
        lst.add(new Developer("Rakesh", new BigDecimal("100332"),26));
        return lst;
    }
}
