package practice_1;

import java.util.Scanner;

public class Q_19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("give rate");
        double rate= sc.nextDouble();
        System.out.println("give name");
        sc.nextLine();
        String name= sc.nextLine();
        if(rate>=0.0&& rate<=2.0){
            System.out.println("name is "+name+" flop ");
        }
       else if(rate>=2.1&& rate<=3.4){
            System.out.println("name is "+name+" semi-hit");
        }
        else if(rate>=3.5&& rate<=4.1){
            System.out.println("name is "+name+"hit");
        }
        else if(rate>=4.2&& rate<=5.0){
            System.out.println("name is "+name+"super hit");
        }
        else {
            System.out.println(" f ");
        }












    }
}
