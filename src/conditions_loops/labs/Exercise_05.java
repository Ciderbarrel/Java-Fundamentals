package conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 5: Calculator
 * <p>
 * Take two numbers from the user, an upper and lower bound. Using a "for-loop", calculate the sum
 * of numbers from the lower bound to the upper bound. Also, calculate the average of numbers.
 * Print the results to the console.
 * <p>
 * For example, if a user enters 1 and 100, the output should be:
 * <p>
 * The sum is: 5050
 * The average is: 50.5
 */

public class Exercise_05 {
    public static void main(String[] args) {
        // create scanner
        Scanner scanner = new Scanner(System.in);

        // prompt user
        System.out.println("Enter two numbers to get a sum of numbers between them, and the average");
        System.out.print("1st number: ");

        // assign input to variable as int
        int firstNumber = scanner.nextInt();

        // prompt user
        System.out.print("2nd number: ");

        // assign input to variable as int
        int secondNumber = scanner.nextInt();

        // find bounds and calculate the average
        int lowerBound = Math.min(firstNumber, secondNumber);
        int upperBound = Math.max(firstNumber, secondNumber);
        int sum = 0;
        double average = ((double) (firstNumber + secondNumber)) / 2.0;

        // calculate the sum
        for (int i = lowerBound; i <= upperBound; i++) {
            sum += i;
        }

        // output
        System.out.println("The sum is: " + sum);
        System.out.println("The average is: " + average);
    }
}
