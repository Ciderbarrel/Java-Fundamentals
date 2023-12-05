package conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 7: First vowel
 * <p>
 * Take in a word from the user and using a "while" loop, find the first vowel in the word.
 * Once you find the vowel, print out the word and the first vowel.
 */

public class Exercise_07 {

    static char[] vowels = {'a', 'e', 'i', 'o', 'u', 'y'};

    private static boolean isVowel(char letter) {

        // Scan the array to see if the letter is a vowel
        for (char c : vowels) {
            if (letter == c) {

                // return true if a vowel is found
                return true;
            }
        }

        // return false because no vowel is found
        return false;
    }

    public static void main(String[] args) {
        // create scanner
        Scanner scanner = new Scanner(System.in);

        // prompt user
        System.out.print("Enter a word: ");

        // assign input to variable as a string
        String word = scanner.nextLine();

        boolean found = false;
        int i = 0;

        while (!found && i < word.length()) {
            if (isVowel(word.charAt(i))) {
                found = true;
            } else {
                i++;
            }
        }

        // output
        System.out.println("The word is: " + word);

        if (found) {
            System.out.println("The first vowel is: " + word.charAt(i));
        } else {
            System.out.println("The word has no vowels");
        }
    }
}
