package Chapter03;

import java.util.Scanner;

/**
 * Figures out if a number is a palindrome
 *
 * @author Shane Faulk
 *
 *
 */
public class C3_2 {

    /**
     * Main method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a 3 digit number");
        int number = input.nextInt();

        int firstDigit = number / 100;

        int lastDigit = number % 10;

        if (firstDigit == lastDigit) {
            System.out.println(number + " is a palindrome");
        } else {
            System.out.println(number + " is not a palindrome");
        }

    }
}
