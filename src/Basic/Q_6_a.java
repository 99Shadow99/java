package Basic;

import java.util.Scanner;

public class Q_6_a {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("give a");
        int a =sc.nextInt();
        System.out.println("give b");
        int b =sc.nextInt();
        int temp =a;
        a=b;
        b=temp;

        System.out.println("a ="+a +" b ="+b);
    }
}
