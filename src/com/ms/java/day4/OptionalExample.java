package com.ms.java.day4;

import java.util.Optional;

import com.ms.java.day3.Student;
import com.ms.java.day3.StudentDataBase;

public class OptionalExample {

    public static String getStudentName(){

       // Student student = StudentDataBase.studentSupplier.get();
        Student student = null;
        if(student!=null){
            return  student.getName();
        }else{
            return  null;
        }
    }

    public static Optional<String> getStudentNameOptional(){

        Optional<Student> student = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        //Optional<Student> student = Optional.ofNullable(null);

        if(student.isPresent()){
            return  student.map(Student::getName); // don't get confused this with streams map method. Both are different.
        }
        return Optional.empty();
    }

    public static void main(String[] args) {


        if(getStudentNameOptional().isPresent()){
            System.out.println(getStudentNameOptional().get());
        }else{
            System.out.println("Name is returned as empty.");
        }


    }
}