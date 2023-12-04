package com.ms.java.day4;

import java.util.Objects;
import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {
        Optional<String> optional = Optional.of("aman");
        Optional<Integer> opt = Optional.empty();
        Optional<String> opt2 = Optional.ofNullable("Welcome!");
        System.out.println(opt2.isPresent());
        System.out.println(opt2.isEmpty());
        opt2.ifPresent(s-> System.out.println("Value is "+s));
        opt.ifPresentOrElse(s -> System.out.println("Nullable"),()-> System.out.println("Default Value"));

        Object obj = Optional.ofNullable(null).orElseGet(()->"default");
        System.out.println(obj);

        Optional.ofNullable("Hello Folks! Lambda").ifPresent(x-> System.out.println(x));
        Optional.ofNullable("Hello Folks! Method Reference").ifPresent(System.out::println);

        Optional.ofNullable("amancs18997@gmail.com").ifPresent(e-> System.out.println("Sending email to "+e));
        Optional.ofNullable("amancs18997@gmail.com").ifPresentOrElse(e-> System.out.println("Sending email to "+e),()->{
            System.out.println("Cannot able to send mail");
        });



    }
}
