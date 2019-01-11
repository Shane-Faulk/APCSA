package Chapter04;

import java.util.Scanner;

/**
 * Calculates employee name, hours worked, pay rate, gross pay, deductions, and
 * net pay and displays them.
 *
 * @author Shane Faulk
 */
public class C4_3 {

    /**
     * Main method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the employee's name. ");
        String name = input.next();

        System.out.print("Enter the number of hours worked. ");
        double hoursWorked = input.nextDouble();

        System.out.print("Enter the hourly payrate. ");
        double hourlyRate = input.nextDouble();

        System.out.print("Enter the federal tax rate. ");
        double fedTax = input.nextDouble();

        System.out.print("Enter the state tax rate. ");
        double stateTax = input.nextDouble();

        double pay = hoursWorked * hourlyRate;
        double fedPercent = fedTax * 100;
        double statePercent = stateTax * 100;
        double fedWith = fedTax * pay;
        double stateWith = stateTax * pay;
        double net = (pay - fedWith) - stateWith;

        System.out.println("Employee name - " + name);
        System.out.println("Hours worked - " + hoursWorked);
        System.out.println("Pay rate - " + hourlyRate);
        System.out.println("Gross pay - " + pay);
        System.out.println("Deductions - ");
        System.out.println("    Federal Withholding " + fedPercent + "% - $" + fedWith);
        System.out.println("    State Withholding " + statePercent + "% - $" + stateWith);
        System.out.println("    Total Deduction - " + (fedWith + stateWith));
        System.out.println("Net pay - " + net);
    }
}
