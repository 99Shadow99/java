package pattern;

import java.util.Scanner;

public class P_1 {
    public static void main(String[] args) {
        System.out.println("give number");
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        for(int i=1;i<=num;i++){

            for(int j=1;j<=num;j++){
                if(j+i==num+1 || i==num || j==num){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println("");
        }
    }
}
