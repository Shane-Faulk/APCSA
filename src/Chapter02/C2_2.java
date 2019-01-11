package Chapter02;

import java.util.Scanner;

/**
 * Calculates interest
 *
 * @author Shane Faulk
 *
 *
 */
public class C2_2 {

    /**
     * Main method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter balance.");
        double balance = input.nextDouble();

        System.out.println("Enter interest rate");
        double rate = input.nextDouble();

        double interest = balance * (rate / 1200);
        System.out.println("The interest is " + interest);
    }
}
