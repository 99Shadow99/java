package pattern;

import java.util.Scanner;

public class P_3 {
    public static void main(String[] args) {
        System.out.println("give the size");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int num2=num;
        int num3=0;
        for(int i=1;i<=num;i++){
            for (int j=1;j<=num3;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=num2;j++){
                System.out.print("* ");
            }
            num2--;
            num3++;
            System.out.println(" ");
        }
    }

}
