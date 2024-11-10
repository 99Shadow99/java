package Maths;

import java.util.Scanner;

public class Q_10 {
    public static void main(String[] args) {
        System.out.println("Give r of sphere");
        Scanner sc=new Scanner(System.in);
        double r=sc.nextDouble();
        double pi = Math.PI;
        System.out.println("area of sphere  ="+(4*pi*Math.pow(r,2)));
    }
}
