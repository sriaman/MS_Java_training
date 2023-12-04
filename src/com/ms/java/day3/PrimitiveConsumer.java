package com.ms.java.day3;

import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;

public class PrimitiveConsumer {

    static IntConsumer c1= c-> System.out.println(c*c);
    static DoubleConsumer d1= c-> System.out.println(c*c);

    public static void main(String[] args) {
        c1.accept(5);
        d1.accept(2.5);
        d1.accept(3);


    }
}
