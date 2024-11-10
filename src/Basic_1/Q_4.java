package Basic_1;

import java.util.Scanner;

public class Q_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("give age");
        int age =sc.nextInt();
        System.out.println("give name");
        sc.nextLine();
        String name=sc.nextLine();
        System.out.println("Hello "+name+" you are " +age +" year old.");
    }
}
