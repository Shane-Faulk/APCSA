package Chapter02;

import java.util.Scanner;

/**
 * Calculates acceleration
 *
 * @author Shane Faulk
 *
 *
 */
public class C2_1 {

    /**
     * Main method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter starting velocity.");
        double velocityStart = input.nextDouble();

        System.out.println("Enter ending velocity");
        double velocityEnd = input.nextDouble();

        System.out.println("Enter time.");
        double time = input.nextDouble();

        double average = (velocityEnd - velocityStart) / time;
        System.out.println("The average acceleration is " + average);
    }
}
