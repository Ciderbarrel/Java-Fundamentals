package datatypes_operators.labs;

import java.util.Scanner;

/**
 * Data Types and Operators Exercise 4: Arrays calculator
 * <p>
 * Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 * calculate the sum of all of the numbers in the array as well as the average.
 * <p>
 * Print the results to the console.
 */

public class Exercise_04 {

    public static void main(String[] args) {
        double[] numbers = new double[10];
        double sum = 0;

        System.out.println("Enter 10 numbers to get the average");

        // create scanner
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter #" + (i + 1) + ": ");
            numbers[i] = scanner.nextDouble();
            sum += numbers[i];
        }

        System.out.println("The sum is " + sum);
        System.out.println("The average is " + (sum / 10.0d));

    }


}