package com.ms.java.day5.combinatorpattern;

import java.time.LocalDate;
import java.time.Period;

public class CustomerValidatorService {
    private boolean isEmailValid(String email){
        return email.contains("@");
    }
    private boolean isMobileNumberValid(String mobNum){
        return mobNum.startsWith("0");
    }
    private boolean isAdult(LocalDate dob){
        return Period.between(dob,LocalDate.now()).getYears()>18;
    }
    public boolean isValidCustomer(Customer customer){
        return isEmailValid(customer.getEmail())&&isAdult(customer.getDob())&&isMobileNumberValid(customer.getMobileNumber());
    }

}
