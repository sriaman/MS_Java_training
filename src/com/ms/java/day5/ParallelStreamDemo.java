package com.ms.java.day5;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ParallelStreamDemo {

    static long performanceCheck(Supplier<Integer> sum, int noOfTimes){
        long start = System.currentTimeMillis();
        for(int i=0;i< noOfTimes;i++){
            sum.get();
        }
        long end = System.currentTimeMillis();
        return end-start;

    }

    static int sum_sequential_stream(){
        int total  = IntStream.rangeClosed(1,100000000).sum();
        return total;
    }

    static int sum_parallel_stream(){
        int total  = IntStream.rangeClosed(1,100000000).parallel().sum();
        return total;
    }
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());

        long sequentialDuration = performanceCheck(ParallelStreamDemo::sum_sequential_stream,20);
        System.out.println("Sequential Duration is Milliseconds is : "+sequentialDuration);

        long parallelDuration = performanceCheck(ParallelStreamDemo::sum_parallel_stream,20);
        System.out.println("Sequential Duration is Milliseconds is : "+parallelDuration);

    }
}
