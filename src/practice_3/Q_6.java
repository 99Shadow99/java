package practice_3;

import java.util.Scanner;

public class Q_6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        do{

            System.out.println("1-t");
            System.out.println("2-c");
            System.out.println("3-r");
            System.out.println("4-r");
            System.out.println("5-end");
            int num=sc.nextInt();
            switch (num){
              case 1->{
                  System.out.println("give h");
                  double h=sc.nextDouble();
                  System.out.println("give b");
                  double b=sc.nextDouble();
                  System.out.println("area of t ="+(1/2)*b*h);
                }
                case 2->{
                    System.out.println("give h");
                    double r=sc.nextDouble();
                    System.out.println("area of t ="+Math.PI*2*r*r);
                }
                case 3->{
                    System.out.println("give l");
                    double l=sc.nextDouble();
                    System.out.println("give b");
                    double b=sc.nextDouble();
                    System.out.println("area of r ="+l*b);
                }
                case 4->{
                    System.out.println("give l");
                    double l=sc.nextDouble();
                    System.out.println("area of s ="+l*l);
                }
                default -> {
                    System.out.println("end");
                    break;
                }

            }
        }while (true);
    }
}
