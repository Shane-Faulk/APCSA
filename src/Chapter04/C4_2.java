package Chapter04;

import java.util.Scanner;

/**
 * Tests if inside another string
 *
 * @author Shane Faulk
 */
public class C4_2 {

    /**
     * Main method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string ");
        String first = input.next();

        System.out.print("Enter another string ");
        String second = input.next();

        if (first.contains(second)) {
            System.out.print(first + " contains " + second);
        } else {
            System.out.print(first + " does not contain " + second);
        }
    }
}
