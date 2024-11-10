package practice_2;

import java.util.Scanner;

public class Q_2 {
    public static void main(String[] args) {
        System.out.println("give number");
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int sum=0;
        int a2=a;
        while(a2!=0){
            sum=sum+(a2%10);
            a2=a2/10;
        }
        System.out.println(a%sum==0?"it is":"it is not");
    }
}
