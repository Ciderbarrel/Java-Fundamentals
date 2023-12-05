package conditions_loops.labs;

/**
 * Conditions and Loops Exercise 8: do-while loop
 * <p>
 * Use a "do-while" loop print out every third number counting backwards from 1000 to 1.
 */

public class Exercise_08 {

    private static final int MAX_PER_LINE = 19;

    public static void main(String[] args) {
        int i = 1000;
        int counter = 0;
        int numToPrintOnLine = MAX_PER_LINE;

        do {
            if (counter == 0) {
                System.out.print(i + " ");
                if (numToPrintOnLine == 0) {
                    System.out.println();
                    numToPrintOnLine = MAX_PER_LINE;
                } else {
                    numToPrintOnLine--;
                }
                counter = 2;
            } else {
                counter--;
            }
            i--;
        } while (i > 0);
    }
}
