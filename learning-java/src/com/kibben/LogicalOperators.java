package com.kibben;

public class LogicalOperators {
    public static void main(String[] args) {
        // Logical Operators
        boolean isAdult = false;
        boolean isStudent = false;
        boolean isAmigoscodeMember = true;
        // && operator. All the expressions must be true otherwise the final expression is false
        System.out.println(isAdult && isStudent);
        // || operator. If one of the condition is trues, then the whole expression is true
        System.out.println(isAdult || isStudent);
        System.out.println((isAdult || isStudent) && isAmigoscodeMember);
        System.out.println((!isAdult || isStudent) && isAmigoscodeMember);
        System.out.println((!isAdult || isStudent) && !isAmigoscodeMember);
        System.out.println(isAdult);
        System.out.println(!isAdult);
        String name = "Mark";
        System.out.println((10 > 8 || 2 <= 2) && !isAdult && name.contains("M"));



    }
}
