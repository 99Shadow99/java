package Maths;

import java.util.Scanner;

public class Q_8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("give Principal amount");
        double p=sc.nextDouble();
        System.out.println("give years ");
        int t=sc.nextInt();
        System.out.println("give Annual interest rate");
        double r=sc.nextDouble();
        System.out.println("give n");
        int n=sc.nextInt();
        System.out.println("Compound Interest ="+(p*Math.pow((1+r/n),(n*t))));
    }
}
