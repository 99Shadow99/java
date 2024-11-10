package Basic;

import java.util.Scanner;

public class Q_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("give age");
        int age =sc.nextInt();
        System.out.println("give name");
        sc.nextLine();
        String name=sc.nextLine();
        System.out.println("name is "+name+" age is " +age);
    }
}
