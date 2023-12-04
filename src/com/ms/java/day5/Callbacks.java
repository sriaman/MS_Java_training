package com.ms.java.day5;

import java.util.function.Consumer;

public class Callbacks {

    static void hello(String first, String last, Consumer<String> callback){
        System.out.println(first);
        if(last!=null){
            System.out.println(last);
        }else{
            callback.accept(first);
        }
    }

    static void hello2(String first, String last, Runnable callback){
        System.out.println(first);
        if(last!=null){
            System.out.println(last);
        }else{
            callback.run();
        }
    }
    public static void main(String[] args) {

        hello("mir","arham",value->{
            System.out.println("No last name provided for "+value);
        });
        hello2("Aman",null,()->{
            System.out.println("No last name provided");
        });

    }
}
