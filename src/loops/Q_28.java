package loops;

import java.util.Scanner;

public class Q_28  {
    public static void main(String[] args) {

        System.out.println("give number");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;

        }
        System.out.println("fact is= "+fact);
    }
}
