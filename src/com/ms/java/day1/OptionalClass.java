package com.ms.java.day1;

import java.sql.SQLOutput;
import java.util.Optional;
import java.util.function.Consumer;

public class OptionalClass {
    public static void main(String[] args) {

        Optional<Integer> optional = getValue();
        Consumer<Integer> c = x-> System.out.println(x);
        optional.ifPresent(c);
        optional.get();
        boolean bool = optional.isPresent()==true;
        Optional<Integer> opt = Optional.empty();
        opt.equals(null);
//        opt.ifPresentOrElse();




    }

    private static Optional<Integer> getValue() {
        Optional<Integer> opt = Optional.of(1);
        return opt;
    }
}
