package datatypes_operators.labs;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Data Types and Operators Exercise 5: More arrays
 * <p>
 * Using the array below, take in a number from 1-10 from the user and print out the index of that
 * element.
 */

public class Exercise_05 {

    private static int findInt(int[] array, int searchValue) {
        boolean continueLoop = true;

        int returnValue = -1;
        int index = 0;

        while (continueLoop) {
            if (index < array.length) {
                if (searchValue == array[index]) {
                    returnValue = index;
                    continueLoop = false;
                } else {
                    index++;
                }
            } else {
                continueLoop = false;
            }
        }

        return returnValue;
    }

    public static void main(String[] args) {

        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        System.out.print("Enter a number 1-10 to get its index: ");

        // create scanner
        Scanner scanner = new Scanner(System.in);
        try {
            int guess = scanner.nextInt();
            int index = findInt(array, guess);

            if (index < array.length && index >= 0)
                System.out.println(guess + " is at index " + index);
            else {
                System.out.println("The number is not in the array");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid value");
        }
    }
}