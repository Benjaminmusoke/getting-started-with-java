package com.kibben;

public class ConcatenatingStrings {
    public static void main(String[] args) {
        // Strings
        String name = "Alex";
        String surname = "Jamir";
        String fullName = name + " Montana " + 1;
        System.out.println(fullName);
        String fullName2 = name.concat(" ").concat(surname);
        System.out.println(fullName2);
    }
}
