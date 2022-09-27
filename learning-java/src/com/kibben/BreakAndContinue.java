package com.kibben;

public class BreakAndContinue {
    public static void main(String[] args) {
        // Break and Continue
        String[] names = {"Anna", "Ali", "Bob", "Mike"};
        for (String name : names) {
            if (name.equals("Bob")) {
                break; // Break simply breaks out of any loop
            }
            System.out.println(name);
        }

        for (String name : names) {
            if (name.startsWith("A")) {
                continue; // Continues to check the loop until a condition doesn't satisfy the logic in a given expression
            }
            System.out.println(name);
        }
    }
}
