package pattern;

import java.util.Scanner;

public class Q_53 {
    public static void main(String[] args) {

        System.out.println("give number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                if(i==j||i+j==num+1){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
