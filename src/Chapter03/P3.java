package Chapter03;

import java.util.Scanner;

/**
 * Uses 2 numbers to see if they are equal, less, or greater. Calculates the grade of first
 * Calculates if second is in range
 *
 * @author Shane Faulk
 */
public class P3 {

    /**
     * Main method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double first;
        double second;

        System.out.println("Input a number.");
        first = input.nextDouble();

        System.out.println("Input another number.");
        second = input.nextDouble();

        if (first < second) {
            System.out.println("The first number is less than the second");
        }
        if (first > second) {
            System.out.println("The first is greater than second");
        }
        if (first == second) {
            System.out.println("The first is equal to the second");
        }
        if (first <= second) {
            System.out.println("The first is less or equal to the second");
        }
        if (first >= second) {
            System.out.println("The first is greater or equal to the second");
        }
        if (first != second) {
            System.out.println("The first is not equal to the second");
        }

        if (second == 0) {
            System.out.println("Cannot divide by zero");
        } else if (first / second < 1) {
            System.out.println("Proper fraction");
        } else {
            System.out.println("Improper fraction");
        }

        if (first >= 90) {
            System.out.println("A");
        } else if (first >= 80) {
            System.out.println("B");
        } else if (first >= 70) {
            System.out.println("C");
        } else if (first >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

        if (second >= 1 && second <= 100) {
            System.out.println("In range");
        } else {
            System.out.println("Out of range");
        }

    }
}
