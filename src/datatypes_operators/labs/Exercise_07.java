package datatypes_operators.labs;

import java.util.Random;

/**
 * Data Types and Operators Exercise 7: Irregular Arrays
 * <p>
 * Create and populate an irregular array of size and contents of your choosing. Using a nested
 * "for-each" loop, iterate and print out each element of the array.
 */

public class Exercise_07 {

    public static void main(String[] args) {

        Random random = new Random();
        final int maxX = 49 + 1;
        final int maxY = 49 + 1;
        final int maxInt = 999999;

        int x = random.nextInt(maxX);
        int y = random.nextInt(maxY);
        int[][] twoDArray = new int[x][y];

        System.out.println("x = " + x);
        System.out.println("y = " + y);

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                twoDArray[i][j] = random.nextInt(maxInt);
            }
        }

        for (int[] i : twoDArray) {
            for (int j : i) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}
