package fundamentals.labs;

import java.util.Scanner;

/**
 * Fundamentals Exercise 5: Days to seconds
 * <p>
 * Take in a number in days from the user between 1 and 1,000,000,000 and convert it to
 * seconds.
 * <p>
 * NOTE: We will be using the Scanner class to collect user input. This is demonstrated below.
 */

public class Exercise_05 {

    public static void main(String[] args) {

        // create scanner
        Scanner scanner = new Scanner(System.in);
        // prompt user
        System.out.print("Enter a number in days between 1 and 1,000,000,000: ");
        // assign input to variable as int
        int days = scanner.nextInt();

        // write completed code here
        // days * 24 hours * 60 minutes * 60 seconds
        long seconds = (long) days * 24 * 60 * 60;
        System.out.println(days + " days = " + seconds + " seconds");
    }
}
