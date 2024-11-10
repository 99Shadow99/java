package Do_while_switch;

import java.util.Scanner;

public class Q_44 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("number ");
        int a=(int)(Math.random()*10);
        int count=0;
        do{
            System.out.println("give the number");
            int b=sc.nextInt();
           if(b==a){
               System.out.println("it correct");
               count++;
           }
           else if(b>a){
               System.out.println("it is high");
           }
           else if(b<a){
               System.out.println("it is low");
           }
        }while (count!=1);




    }
}
