package practice_3;

import java.util.Scanner;

public class Q_3 {
    public static void main(String[] args) {

        System.out.println("give number");
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int sqr=num*num;
        int sum=0;
        while (sqr!=0){
            sum=sum+(sqr%10);
            sqr=sqr/10;
        }
        System.out.println(sum==num?"it is":"it is not");
    }
}
