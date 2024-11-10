package practice_1;

import java.util.Scanner;

public class Q_19_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("give gender");
        char g= sc.next().charAt(0);
        System.out.println("give year of exp");
      int  exp= sc.nextInt();
        sc.nextLine();
        System.out.println("give year of qual p or g");
        char ql= sc.next().charAt(0);

        if(g =='m'|| g=='M'){

            if(ql=='p'|| ql=='Q'){
                if(exp<10){
                    System.out.println(" salary 10000");
                }
                else {
                    System.out.println(" salary 15000");
                }
            }
            else{
                if(exp<10){
                    System.out.println(" salary 7000");
                }
                else {
                    System.out.println(" salary 10000");
                }

            }
        }
        else{

            if(ql=='p'){
                if(exp<10){
                    System.out.println(" salary 10000");
                }
                else {
                    System.out.println(" salary 12000");
                }
            }
            else{
                if(exp<10){
                    System.out.println(" salary 6000");
                }
                else {
                    System.out.println(" salary 90000");
                }

            }
        }














    }
}
