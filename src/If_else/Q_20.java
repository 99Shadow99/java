package If_else;

import java.util.Scanner;

public class Q_20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("give amount");
        double amount=sc.nextDouble();
        if (amount>0&& amount<=5000){
            System.out.println(amount*0.9);
        }
        else if(amount>7000&& amount<=10000){
            System.out.println(amount*0.8);
        }
        else {
            System.out.println(amount*0.7);
        }


    }
}
