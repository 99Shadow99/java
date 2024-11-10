package practice_3;

import java.util.Scanner;

public class Q_2 {
    public static void main(String[] args) {
        System.out.println("give number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int b=1;
        int c=0;
        System.out.println("0");
        System.out.println("1");
        for(int i=3;i<=n;i++){
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}
