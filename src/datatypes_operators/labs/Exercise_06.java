package datatypes_operators.labs;

/**
 * Data Types and Operators Exercise 6: 2D Array
 * <p>
 * Create and populate a 5x5 2D array with multiples of 3, starting with 3. Once populated, print out the results.
 * <p>
 * The output should look something like this:
 * <p>
 * 3 6 9 12 15
 * 18 21 24 27 30
 * ...
 * ...
 * ...
 */

public class Exercise_06 {

    public static void main(String[] args) {

        final int x = 5;
        final int y = 5;
        int[][] twoDArray = new int[x][y];

        int sum = 0;

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                sum += 3;
                twoDArray[i][j] = sum;
            }
        }

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(twoDArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
