package Maths;

import java.util.Scanner;

public class Q_9 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("give side 1");
        double a=sc.nextDouble();
        System.out.println("give side 2");
        double b=sc.nextDouble();
        System.out.println("give side 3");
        double c=sc.nextDouble();
        double s=(a+b+c)/2;

        System.out.println("area of Triangle ="+(Math.sqrt(s*(s-a)*(s-b)*(s-c))));



    }
}
