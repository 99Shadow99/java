package loops;

import java.util.Scanner;

public class Q_37 {
    public static void main(String[] args) {
        System.out.println("giv number ");
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int num2=num;
        int rev=0;
        while (num2!=0){
            int rem=num2%10;
            rev=rev*10+rem;
            num2=num2/10;
        }
        System.out.println(num==rev?"it is pallindromic number ":"it is not pallindromic number");
    }
}
