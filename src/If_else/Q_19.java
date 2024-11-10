package If_else;

import java.util.Scanner;

public class Q_19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("give day year ");
        int num =sc.nextInt();

        if(num%4==0){
            if(num%100==0 ){
                if(num%400==0){
                    System.out.println(" leap year ");
                }
                else {
                    System.out.println("not leap year ");
                }
            }
            else {
                System.out.println("leap year ");
            }
        }
        else {
            System.out.println("not leap year ");
        }






    }
}
