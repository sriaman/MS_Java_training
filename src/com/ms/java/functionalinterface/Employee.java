package com.ms.java.functionalinterface;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Employee {

    private String firstName;
    private String lastName;
    private int id;
    private LocalDate dateOfBirth;
    private int salary;
    private String dept;

    private LocalDate joiningDate;


    public Employee(String firstName, String lastName, int id, LocalDate dateOfBirth, int salary, String dept) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.dateOfBirth = dateOfBirth;
        this.salary = salary;
        this.dept = dept;
    }

    public Employee(String firstName, String lastName, int id, LocalDate dateOfBirth, int salary, String dept, LocalDate joiningDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.dateOfBirth = dateOfBirth;
        this.salary = salary;
        this.dept = dept;
        this.joiningDate = joiningDate;
    }

    public LocalDate getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(LocalDate joiningDate) {
        this.joiningDate = joiningDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", salary=" + salary +
                ", dept='" + dept + '\'' +
                '}';
    }

    public static List<Employee> getAllEmployee(){
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee("Aman", "Srivastav",1001, LocalDate.of(2000,11,22),123456,"IT",LocalDate.of(2023,01,02)));
        empList.add(new Employee("Saket", "Srivastav",1002,LocalDate.of(1997,12,21),1236,"HR",LocalDate.of(2023,02,25)));
        empList.add(new Employee("Harsh", "Srivastav",1003,LocalDate.of(1998,01,20),1265,"HR",LocalDate.of(2022,11,28)));
        empList.add(new Employee("Amrita", "Srivastav",1004,LocalDate.of(1992,11,22),2313,"Finance",LocalDate.of(2020,11,02)));
        empList.add(new Employee("Vivek", "Srivastav",1005,LocalDate.of(1995,11,22),123987,"HR",LocalDate.of(2023,05,22)));
        empList.add(new Employee("Siddharth", "Kumar",1006,LocalDate.of(2003,11,22),123675,"Finance",LocalDate.of(2021,10,26)));

        return empList;
    }
}
