package datatypes_operators.labs;

import java.util.Scanner;

/**
 * Data Types and Operators Exercise 3: Pig latin
 * <p>
 * Take in the user's name and print out their name translated to pig latin.
 * For the purpose of this program, we will say that any word or name can be
 * translated to pig latin by moving the first letter to the end, followed by "ay".
 * For example: ryan -> yanray, caden -> adencay
 * <p>
 * HINT: We will make use of the substring() method.
 */

public class Exercise_03 {

    public static void main(String[] args) {

        // write code here
        // create scanner
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        if (name.length() > 1) {
            name = name.substring(1) + name.charAt(0) + "ay";
        } else {
            name += "ay";
        }

        System.out.println("Your name is " + name + " in pig latin.");

    }
}


