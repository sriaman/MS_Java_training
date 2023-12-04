package com.ms.java.day5;

import com.ms.java.day3.Student;
import com.ms.java.day3.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class ParallelStreamDemo2 {

    static List<String> sequentialStream(){
        long start = System.currentTimeMillis();
        List<String > studentActivities = StudentDataBase.getAllStudents().stream().map(Student::getActivities).flatMap(List::stream).distinct().sorted().collect(Collectors.toList());

        long duration  = System.currentTimeMillis()-start;
        System.out.println("Duration in sequential stream is : "+duration);
        return studentActivities;
    }

    static List<String> parallelStream(){
        long start = System.currentTimeMillis();
        List<String > studentActivities = StudentDataBase.getAllStudents().parallelStream().map(Student::getActivities).flatMap(List::stream).distinct().sorted().collect(Collectors.toList());

        long duration  = System.currentTimeMillis()-start;
        System.out.println("Duration in Parallel stream is : "+duration);
        return studentActivities;
    }
    public static void main(String[] args) {
        System.out.println("Sequential Stream is : "+sequentialStream());
        System.out.println("Parallel Stream is : "+parallelStream());
    }
}
