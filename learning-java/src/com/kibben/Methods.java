package com.kibben;

public class Methods {
    public static void main(String[] args) {
        // Methods
        System.out.println("Hello"); // println() is a built-in method we are invoking
        String brand = "Samsung";
        System.out.println(brand.toUpperCase()); // using toUpperCase() method, and we're not passing any data
        boolean startsWithS = brand.startsWith("s"); // we are passing some data into this method startsWith("S")
        System.out.println(brand.startsWith("S"));
        System.out.println(brand.endsWith("f"));
    }
}
