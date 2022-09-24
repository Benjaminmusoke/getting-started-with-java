package com.kibben;

public class TheStringClass {
    public static void main(String[] args) {
        // String
        String name = new String("Amigoscode");
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.charAt(1));
        String code = "codes";
        System.out.println(name.contains(code));
        System.out.println(name.equals(code));
    }
}
