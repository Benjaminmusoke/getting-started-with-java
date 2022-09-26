package com.kibben;

public class PlusPlusAndMinusMinus {
    public static void main(String[] args) {
        // Loops
        int[] numbers = {2, 0, 1, 4, 100, 4, 90, 78, 77};

        int number = 0;
        number++; // number++ is the same thing as: number = number + 1.
        // If you want to increment by 2: number = number + 2
        System.out.println(number);

        // Using a for loop instead
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Reverse order
        for (int i = numbers.length - 1; i >= 0; i--){
            System.out.println(numbers[i]);
        }

        int secondNumber = 0;
        secondNumber--; // number-- is the same thing as: number = number - 1.
        // If you to want to decrement by 2: number = number - 2
        System.out.println(secondNumber);

        int thirdNumber = 3;
        thirdNumber += 5; // this is the same as: thirdNumber = thirdNumber + 5
        System.out.println(thirdNumber);

        int fourthNumber = 3;
        fourthNumber -= 5; // this is the same as: fourthNumber  = fourthNumber - 5
        System.out.println(fourthNumber);

    }
}
