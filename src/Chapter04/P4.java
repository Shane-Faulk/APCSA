package Chapter04;

import java.util.Scanner;

/**
 * Determines a winner between 2 people
 *
 * @author Shane Faulk
 */
public class P4 {

    /**
     * Main method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name1 = input.next();
        System.out.print("How many hours will you require? ");
        double hours1 = input.nextDouble();
        System.out.print("How much do you charge per hour? ");
        double rate1 = input.nextDouble();

        System.out.print("What is your name? ");
        String name2 = input.next();
        System.out.print("How many hours will you require? ");
        double hours2 = input.nextDouble();
        System.out.print("How much do you charge per hour? ");
        double rate2 = input.nextDouble();

        double firstCost = hours1 * rate1;
        double secondCost = hours2 * rate2;

        if (firstCost < secondCost) {
            System.out.printf("The winner is %s %.2f", name1, firstCost);
        } else if (secondCost < firstCost) {
            System.out.printf("The winner is %s %.2f", name2, secondCost);
        } else if (firstCost == secondCost && hours1 < hours2) {
            System.out.printf("The winner is %s %.2f %f", name1, firstCost, hours1);
        } else if (firstCost == secondCost && hours2 < hours1) {
            System.out.printf("The winner is %s %.2f %.2f", name2, secondCost, hours2);
        } else if (firstCost == secondCost && hours2 == hours1) {
            System.out.printf("It is a tie between %s and %s %.2f %.2f %.2f", name1, name2, hours1, rate2, firstCost);
        }

    }
}
