package pattern;

import java.util.Scanner;

public class P_4 {
    // hollow t
    public static void main(String[] args) {
        System.out.println("give the size");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if(j==1 || j==i || i==num)System.out.print("* ");
                else System.out.print("  ");

            }
            System.out.println(" ");
        }
    }
}

