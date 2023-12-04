package com.ms.java.day4;

import java.util.Optional;

public class OptionalOfEmptyOfNullableDemo {

    static Optional<String> ofNullable(){
//        Optional<String> opt = Optional.ofNullable("Welcome folks!");
//        return opt;
        return Optional.of("Welcome Folks!");
    }

    static Optional<String> of(){
        return Optional.of("Aman");
    }

    static Optional<String> empty(){
        return Optional.empty();
//        return Optional.of(null);
    }
    public static void main(String[] args) {
        System.out.println(ofNullable().get());
        System.out.println(ofNullable().isEmpty());
        System.out.println(ofNullable().isPresent());
        System.out.println(of().get());
        System.out.println(empty());
    }
}
