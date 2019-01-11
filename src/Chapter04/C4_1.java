package Chapter04;

import java.util.Scanner;

/**
 * Prints the major and grade level
 *
 * @author Shane Faulk
 */
public class C4_1 {

    /**
     * Main method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the character for the major");
        String student = input.next();
        char major = student.charAt(0);

        System.out.print("Enter the grade");
        int grade = input.nextInt();

        if (major == 'M') {
            System.out.print("Mathematics ");
        } else if (major == 'C') {
            System.out.print("Computer Science ");
        } else if (major == 'I') {
            System.out.print("Information Technology ");
        } else {
            System.out.println("Error");
        }

        if (grade == 1) {
            System.out.println("Freshman");
        } else if (grade == 2) {
            System.out.println("Sophomore");
        } else if (grade == 3) {
            System.out.println("Junior");
        } else if (grade == 4) {
            System.out.println("Senior");
        } else {
            System.out.println("Error");
        }

    }
}
