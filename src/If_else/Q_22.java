package If_else;

import java.util.Scanner;

public class Q_22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("give unit");
        double amount=sc.nextDouble();
        if (amount>0&& amount<=100){
            System.out.println(amount*4.2);
        }
        else if(amount>101&& amount<=200){
            System.out.println(100*4.2+(amount-100)*6);
        }
        else if(amount>201&& amount<=400){
            System.out.println(100*4.2+200*6+(amount-200)*8);
        }
        else {
            System.out.println(100*4.2+200*6+400*8+(amount-400)*13);
        }


    }
}
