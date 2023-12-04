package com.ms.java.lambda;

import java.util.function.Consumer;

public class lambdaVariable1 {

    public static void main(String[] args) {
        int x=0; //Local Variable
        //repeated  variable not allowed
        Consumer<Integer> consumer = (y)->{
            //cannot be redeclared
            /*int x=1;8*/
            System.out.println(y);
        };



    }
}
