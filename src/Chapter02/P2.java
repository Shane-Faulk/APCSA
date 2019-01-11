package Chapter02;

import java.util.Scanner;

/**
 * Calculates the total cost of a meal including tax and tip
 *
 * @author Shane Faulk
 */
public class P2 {

    /**
     * Main method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input the price of the meal.");
        double meal = input.nextDouble();

        System.out.println("Input the price of the drink");
        double drink = input.nextDouble();

        System.out.println("Input the price of the dessert");
        double dessert = input.nextDouble();

        double foodPrice = meal + drink + dessert;
        double salesTax = foodPrice * .1;
        double tip = (foodPrice + salesTax) * .15;
        double total = foodPrice + salesTax + tip;

        System.out.println("The price of the meal is " + meal);
        System.out.println("The price of the tax is " + salesTax);
        System.out.println("The price of the tip is " + tip);
        System.out.println("The total cost is " + total);
    }
}
