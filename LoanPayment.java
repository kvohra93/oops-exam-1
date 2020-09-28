/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loanpayment;

import java.util.Scanner;


public class LoanPayment {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Loan Amount: ");
        double principalAmount = scanner.nextDouble();

        System.out.print("Enter the Number of Years: ");
        int numbYears = scanner.nextInt();

        System.out.print("Annual Interest Rate : ");
        double yearlyInterest = scanner.nextDouble();

        System.out.println();

        loamAmortizationSched(principalAmount, yearlyInterest, numbYears);
    }

    /**
     * 
     *
     * @param principalAmount
     * @param yearlyInterest 
     * @param numbYears
     */
    public static void loamAmortizationSched(double principalAmount, double yearlyInterest,
            int numbYears) {
        double interestPerMonth, principalPerMonth, remainingAmount;
        double monthlyInterest, monthlyAmt;

        int numbMonths = numbYears * 12;

        monthlyInterest = yearlyInterest / 12;
        monthlyAmt = payPerMonth(principalAmount, monthlyInterest, numbYears);
        System.out.format("Monthly Payment: %8.2f%n", monthlyAmt);
        System.out.format("Total Payment:   %8.2f%n", monthlyAmt * numbYears * 12);

        tableHead();

        for (int i = 1; i <= numbMonths; i++) {

            interestPerMonth = principalAmount * (monthlyInterest / 100);
            principalPerMonth = monthlyAmt - interestPerMonth;
            remainingAmount = principalAmount - principalPerMonth;

            listPayment(i, interestPerMonth, principalPerMonth, remainingAmount);

            principalAmount = remainingAmount;
        }
    }

    /**
     * @param loanAmount
     * @param monthlyInterestRate 
     * @param numberOfYears
     * @return monthly amount paid
     */
    static double payPerMonth(double loanAmount, double monthlyInterestRate, int numberOfYears) {
        monthlyInterestRate /= 100;
        return loanAmount * monthlyInterestRate
                / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
    }

   
    private static void listPayment(int month, double interestPerMonth,
            double principalPerMonth, double remainingAmount) {
        System.out.format("%8d%10.2f%10.2f%12.2f\n",
                month, interestPerMonth, principalPerMonth, remainingAmount);
    }

    private static void tableHead() {

        System.out.format("\n%8s%10s%10s%12s\n",
                "Payment#", "Interest", "Principal", "Balance");

    }
}
