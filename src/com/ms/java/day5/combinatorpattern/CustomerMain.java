package com.ms.java.day5.combinatorpattern;

import java.time.LocalDate;
import static com.ms.java.day5.combinatorpattern.CustomerRegistrationValidator.*;
public class CustomerMain {
    public static void main(String[] args) {
        Customer cust = new Customer("Aman Srivastav",
                "aman@gmail.com",
                "+098987474744",
                LocalDate.of(1997,1,1));
        System.out.println(new CustomerValidatorService().isValidCustomer(cust));

        //Combinator pattern
        CustomerRegistrationValidator.ValidationResult vr = isEmailValid().and(isMobileNumberValid()).and(isAdultValid()).apply(cust);
        System.out.println(vr);
        if(vr!=ValidationResult.SUCCESS){
            throw new IllegalStateException(vr.name());
        }
    }
}
