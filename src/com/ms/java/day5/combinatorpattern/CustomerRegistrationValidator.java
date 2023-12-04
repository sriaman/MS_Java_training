package com.ms.java.day5.combinatorpattern;


import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;
import static com.ms.java.day5.combinatorpattern.CustomerRegistrationValidator.*;
public interface CustomerRegistrationValidator extends Function<Customer, ValidationResult> {

    static CustomerRegistrationValidator isEmailValid(){
        return customer -> {
            System.out.println("Running email validator");
            return  customer.getEmail().contains("@")? ValidationResult.SUCCESS:ValidationResult.EMAIL_NOT_VALID;
        };
    }
    static CustomerRegistrationValidator isMobileNumberValid(){
        return customer -> {
            System.out.println("Running Mobile Number validator");
            return  customer.getMobileNumber().startsWith("+0")? ValidationResult.SUCCESS:ValidationResult.NUMBER_NOT_VALID;
        };
    }
    static CustomerRegistrationValidator isAdultValid(){
        return customer -> {
            System.out.println("Running Adult validator");
            return  Period.between(customer.getDob(), LocalDate.now()).getYears()>18 ? ValidationResult.SUCCESS:ValidationResult.CUSTOMER_NOT_VALID;
        };
    }

    default CustomerRegistrationValidator and(CustomerRegistrationValidator crv){
        return customer->{
            ValidationResult result = this.apply(customer);
            return result;
        };

    }

    enum ValidationResult{
        SUCCESS,
        NUMBER_NOT_VALID,
        EMAIL_NOT_VALID,
        CUSTOMER_NOT_VALID

    }
}
