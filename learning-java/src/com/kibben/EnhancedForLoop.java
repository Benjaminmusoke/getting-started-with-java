package com.kibben;

import java.util.Arrays;

public class EnhancedForLoop {
    public static void main(String[] args) {

        // Loops
        int[] numbers = {2, 0, 1, 4, 100, 4, 90, 78, 77};
        String[] names = {"Anna", "Ali"};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Enhanced for loop
        System.out.println("Enhanced for loop");
        // Doesn't give you access to actual index
        for (int number : numbers) {
            System.out.println(number);
        }

        System.out.println("-------------------------------");
        System.out.println("---------------------------------");

        for (String name : names) {
            System.out.println(name);
        }

        // Intellij shortcut for creating for loops
        // numbers.for gives you for loops options by Intellij
        for (int i = 0; i < numbers.length; i++) {

        }

        // numbers.for gives you for loops options by Intellij
        for (int i = numbers.length - 1; i >= 0; i--) {

        }
         // names.for give enhanced for to use by Intellij
        for (String name : names) {

        }
        System.out.println("-----------------------------------");
        System.out.println("------------------------------------");

        // Advanced way to loop through Arrays
        System.out.println("Advance way to loop through Arrays");
        Arrays.stream(numbers).forEach(System.out::println);
        Arrays.stream(names).forEach(System.out::println);
    }
}
