package com.kibben;

public class WhileLoop {
    public static void main(String[] args) {
        // While loop

//        while(true) {
//            System.out.println("hi"); // this print forever unless it's stopped manually.
//        }

        int count = 0;

        // while runs the loop as long as the boolean expression is true
        while (count <= 20) {
            System.out.println("count " + count);
            count++;
        }
    }
}
