package com.ms.java.day5.combinatorpattern;

import java.time.LocalDate;

public class Customer {

    private final String name;
    private final String email;
    private final String mobileNumber;
    private final LocalDate dob;

    public Customer(String name, String email, String mobileNumber, LocalDate dob) {
        this.name = name;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public LocalDate getDob() {
        return dob;
    }


}
