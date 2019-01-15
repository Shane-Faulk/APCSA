package Chapter05;

import java.util.Scanner;

/**
 * Determines the number of negatives and positives in a group of numbers, as
 * well as the total and average.
 *
 * @author Shane Faulk
 */
public class C5_1 {

    /**
     * Main method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer. To stop input, enter 0");

        int evenTotal = 0;
        int evenCount = 0;
        int oddCount = 0;
        int oddTotal = 0;
        int number;
        int count = 0;
        double total = 0;
        double average = 0;

        do {
            System.out.print("Enter: ");
            number = input.nextInt();
            if (number == 0) {
                break;
            }

            if (number % 2 == 0) {
                ++evenCount;
                evenTotal = evenTotal + number;

            }
            if (number % 2 != 0) {
                ++oddCount;
                oddTotal = oddTotal + number;
            }

        } while (true);
        total = oddTotal + evenTotal;
        count = evenCount + oddCount;

        if (count == 0) {
            System.out.println("No numbers entered except 0");
        } else {
            average = total / count;
            System.out.printf("Number of positives - %d \n", evenCount);
            System.out.printf("Number of negatives - %d \n", oddCount);
            System.out.printf("Total - %.2f \n", total);
            System.out.printf("Average - %.2f \n", average);
        }

    }

}
