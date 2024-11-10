package Maths;

import java.util.Scanner;

public class Q_8_b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input principal amount
        System.out.println("Give Principal amount:");
        double p = sc.nextDouble();

        // Input time in years
        System.out.println("Give years:");
        int t = sc.nextInt();

        // Input annual interest rate (as a percentage)
        System.out.println("Give Annual interest rate:");
        double r = sc.nextDouble();

        // Input number of times interest is compounded per year
        System.out.println("Give n (number of times interest is compounded per year):");
        int n = sc.nextInt();

        // Convert the annual interest rate to decimal form (e.g., 10% -> 0.10)
        r = r / 100;

        // Calculate total amount after compound interest
        double totalAmount = p * Math.pow(1 + r / n, n * t);

        // Calculate compound interest
        double compoundInterest = totalAmount - p;

        // Print the result
        System.out.println("Compound Interest = " + compoundInterest);
    }

}


