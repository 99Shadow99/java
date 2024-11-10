package pattern;

import java.util.Scanner;

public class Q_52 {
    public static void main(String[] args) {
        System.out.println("give number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){

            for(int j=1;j<=(num*2)-1;j++){
                if(i==j||j+i==num*2){
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
