package com.lex.combinatorpattern;

import java.time.LocalDate;
import java.time.Period;

public class CustomerValidatorService {

    public boolean isEmailValid(String email){
        return email.contains("@");
    }

    public boolean isPhoneNumberValid(String phoneNumber){
        return phoneNumber.startsWith("+0");
    }

    public boolean isAdult(LocalDate birth){
        return Period.between(birth, LocalDate.now()).getYears() > 18;
    }
}
