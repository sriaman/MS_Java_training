package com.ms.java.day3;

import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorReferenceDemo {

    static Supplier<Student> studentSupplier = Student::new;
    static Function<String,String> studentFunction = String::new;

    public static void main(String[] args) {
        System.out.println(studentSupplier.get());
        System.out.println(studentFunction.apply("Aman"));
    }
}
