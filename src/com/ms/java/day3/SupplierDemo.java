package com.ms.java.day3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {

    static Supplier<Student> studentSupplier = ()->new Student("Adam",2,4.0,"male", Arrays.asList("swimming", "basketball","volleyball"));
    static Supplier<List<Student>> lstStud = ()->StudentDataBase.getAllStudents();

    public static void main(String[] args) {

        Student student = studentSupplier.get();
        System.out.println("Student : "+student);

        System.out.println("Students are: "+ lstStud.get());
    }
}
