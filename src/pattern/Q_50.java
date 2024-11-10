package pattern;

import java.util.Scanner;

public class Q_50 {
    public static void main(String[] args) {
        System.out.println("give the  number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int num2=num;
        for(int i=1;i<=num;i++){
            num2--;
            for(int j=1;j<=num2;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }

    }
}
