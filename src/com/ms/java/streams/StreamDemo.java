package com.ms.java.streams;

import com.ms.java.functionalinterface.Employee;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamDemo {
    public static void main(String[] args) {

        //1. Write a program to print First Name of employees which joined in year 2023.
        List<Employee> empList = Employee.getAllEmployee();
        empList.stream().filter(x->x.getJoiningDate().getYear()==2023).forEach(x->System.out.println(x.getFirstName()));

        //2. Write a program to print count, min, max, sum, and the average of salary of all employees in a particular department.
        //count
        Map<String,Long> map = empList.stream().collect(Collectors.groupingBy(x->x.getDept(),Collectors.counting()));
        map.entrySet().stream().forEach(x-> System.out.println(x.getKey()+" "+x.getValue()));

        //min
        Map<String, Optional<Employee>> map2 = empList.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.minBy(Comparator.comparing(Employee::getSalary))));
        map2.entrySet().stream().forEach(x-> System.out.println(x.getKey()+" "+x.getValue().get().getSalary()));

        //max
        Map<String, Optional<Employee>> map3 = empList.stream().collect(Collectors.groupingBy(x->x.getDept(),Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
        map3.entrySet().forEach(x-> System.out.println(x.getKey()+" "+x.getValue().get().getSalary()));

        //sum
        Map<String, IntSummaryStatistics> map4 = empList.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors.summarizingInt(x->x.getSalary())));
        map4.entrySet().stream().forEach(x-> System.out.println(x.getKey()+" "+x.getValue().getSum()));

        //average
        map4.entrySet().stream().forEach(x-> System.out.println(x.getKey()+" "+x.getValue().getAverage()));

        //3. Write a program to print sorted list of employees by firstName in all departments except HR department.
        empList.stream().filter(x->x.getDept()!="HR").sorted(Comparator.comparing(x->x.getFirstName())).forEach(System.out::println);

        //4. Write a program to increment salary of employees in particular department by 10%.
        empList.stream().map(x->x.getSalary()*1.1).forEach(System.out::println);
//        Map<String,List<Employee>> map5 = empList.stream().map(x->x.getSalary()*1.1).collect(Collectors.groupingBy(Employee::getDept));

        //5. Write a program using stream to print 50 odd numbers after 100.
        IntStream.range(100,200).filter(x->x%2==1).forEach(System.out::println);

        //6. Write a program to create comma seperated list of First names of employees order by dateOfbirth.
        String str = empList.stream().sorted(Comparator.comparing(x->x.getDateOfBirth())).map(x->x.getFirstName()).collect(Collectors.joining(", "));
        System.out.println(str);
    }
}
