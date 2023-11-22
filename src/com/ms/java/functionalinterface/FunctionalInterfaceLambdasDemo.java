package com.ms.java.functionalinterface;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class FunctionalInterfaceLambdasDemo {
    public static void main(String[] args) throws InterruptedException {
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee("Aman", "Srivastav",1001, LocalDate.of(2000,11,22),123456,"IT"));
        empList.add(new Employee("Saket", "Srivastav",1002,LocalDate.of(1997,12,21),1236,"HR"));
        empList.add(new Employee("Harsh", "Srivastav",1003,LocalDate.of(1998,01,20),1265,"HR"));
        empList.add(new Employee("Amrita", "Srivastav",1004,LocalDate.of(1992,11,22),2313,"Finance"));
        empList.add(new Employee("Vivek", "Srivastav",1005,LocalDate.of(1995,11,22),123987,"HR"));
        empList.add(new Employee("Siddharth", "Kumar",1006,LocalDate.of(2003,11,22),123675,"Finance"));

        //Consumer Using Lambda Expression
        Consumer<Employee> c = x-> System.out.println(x);
        empList.forEach(c);

        //Consumer Using Method References
        empList.forEach(System.out::println);

        //filter Employee with salary above 2000
        List<Employee> result = empList.stream().filter(x->x.getSalary()>2000).collect(Collectors.toList());
        System.out.println(result);

        getEmpDetails(result);

        //Predicate
        Predicate<Employee> p = x-> x.getSalary() > 2000;
        empList.stream().filter(p).collect(Collectors.toList());

        //Predicate using methods
        List<Employee> rs = getEmpDetails(empList, 2000);
        getEmpDetails(rs);

        //BiPredicate
        BiPredicate<Employee, Integer> bp = (x,y)->{
            return x.getSalary()>y;
        };
        List<Employee> resu = filterBiPredicate(empList,bp,2000);
        getEmpDetails(resu);


        //User Question2

        Supplier<String> s = ()->{
            SecureRandom random = new SecureRandom();
            return new BigInteger(64,random).toString(16);
        };
        System.out.println(s.get());


        //1. Write a program to Sort the list of employees by month in dateOfBirth. in Sort method use Lamda in comparator.
        List<User> userList = new ArrayList<>();
        for(Employee emp:empList)
            userList.add(getUser(emp));
        System.out.println(userList);

        List<Employee> resul = empList.stream().sorted((o1,o2)-> o1.getDateOfBirth().getYear()-o2.getDateOfBirth().getYear()).collect(Collectors.toList());
        System.out.println(resul);

        //2. Write a program to Create 2 threads using lambda. One thread will print list of employees another will print list of users.
        Thread thread1 = new Thread(()->{
            System.out.println("Thread1" +empList);
        });
        Thread thread2 = new Thread(()->{
            System.out.println("Thread2"+userList);
        });
        thread1.start();
        thread1.join();
        thread2.start();

        //3. Write own functional interface UserNameGenerator which has generate method which accepts 4 parameters firstName,LastName,YearOfBirth,id. Write logic to implement generate() method using lamda and use it to generate User in question 2 above.
        UserNameGenerator userNameGenerator = (fn,ln,yob,id)->{
            return ln.substring(0,3)+fn.substring(0,3)+yob%1000+id;
        };

        List<User> lstUser = new ArrayList<>();
        for(Employee emp:empList)
            lstUser.add(getUsernameGenerate(emp));
        System.out.println(lstUser);

    }

    private static User getUsernameGenerate(Employee emp) {
        UserNameGenerator userNameGenerator = (fn,ln,yob,id)->{
            return ln.substring(0,3)+fn.substring(0,3)+yob%1000+id;
        };
        Supplier<String> s = ()->{
            SecureRandom random = new SecureRandom();
            return new BigInteger(64,random).toString(16);
        };
        User user= new User();
        user.setUserName(userNameGenerator.generate(emp.getFirstName(),emp.getLastName(),emp.getDateOfBirth().getYear(),emp.getId()));
        user.setId(emp.getId());
        user.setPassword(s.get());
        return user;
    }

    private static User getUser(Employee employee) {

        User user = new User();
        user.setUserName(employee.getFirstName()+"_"+employee.getLastName()+"_"+employee.getDateOfBirth()+"_"+employee.getId());
        Supplier<String> s = ()->{
            SecureRandom random = new SecureRandom();
            return new BigInteger(64,random).toString(16);
        };
        //System.out.println(s.get());
        user.setPassword(s.get());
        user.setId(employee.getId());
        return user;
    }

    private static List<Employee> filterBiPredicate(List<Employee> empList, BiPredicate<Employee, Integer> bp, int salary) {
       return empList.stream().filter(x->bp.test(x,salary)).collect(Collectors.toList());
    }

    private static List<Employee> getEmpDetails(List<Employee> empList, int salary) {
        Predicate<Employee> p = x->x.getSalary()>salary;
        return empList.stream().filter(p).collect(Collectors.toList());
    }

    private static void getEmpDetails(List<Employee> empList) {
        Consumer<Employee> c = x-> System.out.println(x);
        empList.forEach(c);
    }
}
