package com.ms.java.functionalinterface;

import java.time.LocalDate;

@FunctionalInterface
public interface UserNameGenerator {
    String generate(String firstname, String lastName, int yearOfBirth, int id);
}
