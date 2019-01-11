package Chapter02;

import java.util.Scanner;

/**
 * Calculates the cost of driving
 *
 * @author Shane Faulk
 *
 *
 */
public class C2_3 {

    /**
     * Main method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input the distance of the drive");
        double distance = input.nextDouble();

        System.out.println("Input the miles per gallon of car");
        double mpg = input.nextDouble();

        System.out.println("Input the price per gallon");
        double price = input.nextDouble();

        double cost = (distance / mpg) * price;
        System.out.println("The cost of driving is " + cost);
    }
}
