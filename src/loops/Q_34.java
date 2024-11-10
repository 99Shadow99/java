package loops;

import java.util.Scanner;

public class Q_34 {
    public static void main(String[] args) {
        System.out.println("give number");
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        while(num!=0){
           int d= num%10;
           num=num/10;
            System.out.println(d);
        }
    }
}
