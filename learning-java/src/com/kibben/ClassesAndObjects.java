package com.kibben;

import java.time.LocalDate;

public class ClassesAndObjects {
    public static void main(String[] args) {
        // Classes and Objects
        Passport ukPassport = new Passport("1234", "England", LocalDate.of(2025, 1, 1));

        Passport usPassport = new Passport("1234", "USA", LocalDate.of(2030, 1, 1));

        System.out.println(ukPassport.number);
        System.out.println();
        System.out.println(usPassport);

    }

    static class Passport {
        String number;
        String country;
        LocalDate expiryDate;

        Passport(String number, String country, LocalDate expiryDate) {
            this.number = number;
            this.country = country;
            this.expiryDate = expiryDate;
        }
    }
}
