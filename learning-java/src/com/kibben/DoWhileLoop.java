package com.kibben;

public class DoWhileLoop {
    public static void main(String[] args) {
        // Do While loop
        int count = 20;

        // do print this while at least once the condition is true
        // do while executes no matter what at least once
        do {
            System.out.println("count " + count);
            count++;
        }
        while (count <= 20);
    }
}
