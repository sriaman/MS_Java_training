package com.ms.java.lambda;

import java.util.function.Consumer;

public class LambdaVariable2 {

    static int y=5;

    public static void main(String[] args) {

//        int y=5;
        Consumer<Integer> c = (z)->{
            //can't increment local variable
            y++;
            System.out.println(y+z);
        };
        c.accept(4);
    }
}
