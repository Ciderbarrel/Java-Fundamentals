package fundamentals.labs;

/**
 * Fundamentals Exercise 4: Volume and Surface Area
 * <p>
 * Write the necessary code to calculate the volume and surface area of a cylinder
 * with a radius of 3.14 and a height of 5. Print out the result.
 */

public class Exercise_04 {

    public static void main(String[] args) {

        // write code here
        double height = 5.0;
        double radius = 3.14;
        double volume = Math.PI * Math.pow(radius, 2) * 5;
        double surfaceArea = (2 * Math.PI * radius * height) + (2 * Math.PI * Math.pow(radius, 2));

        System.out.println("For height " + height + ", and radius " + radius);
        System.out.println("Volume = " + volume);
        System.out.println("Surface Area = " + surfaceArea);

    }
}
