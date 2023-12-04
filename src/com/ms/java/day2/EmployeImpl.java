package com.ms.java.day2;

import java.sql.SQLOutput;

public class EmployeImpl implements Employee{

    @Override
    public void populate() {
        System.out.println("Aman");
    }

    @Override
    public void display() {
        Employee.super.display();
    }

    @Override
    public void process() {
        Employee.super.process();
    }
}
