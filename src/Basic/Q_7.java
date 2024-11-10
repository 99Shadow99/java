package Basic;

import java.util.Scanner;

public class Q_7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("give age ");
        int age =sc.nextInt();
        System.out.println("give name ");
        sc.nextLine();
        String b =sc.nextLine();
        if(age>=18){
            System.out.println("can vote ");
        }
        else {
            System.out.println("can't vote ");
            System.out.println("can vote after "+(18-age)+"years");
        }






    }
}
