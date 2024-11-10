package Maths;

import java.util.Scanner;

public class Q_11 {
    public static void main(String[] args) {
        System.out.println("Give r of circle");
        Scanner sc=new Scanner(System.in);
        double r=sc.nextDouble();
        double pi = Math.PI;
        System.out.println("circumference is ="+(2*pi*r));
        System.out.println("area is ="+(pi*Math.pow(r,2)));

    }
}
