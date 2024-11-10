package loops;

import java.util.Scanner;

public class Q_39 {
    public static void main(String[] args) {
        System.out.println("give number");
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
        int sum = 0;
        int i = 0;
        int count=0;
        int sqr=(int)Math.pow(num, 2);
        int sqr2=sqr;
        while (sqr2 != 0) {
            int rem = sqr2 % 10;
           sum=rem*(int)Math.pow(10,i)+sum;
           sqr2=sqr2/10;
            i++;
           if(sum==sqr){
               count++;
               break;
           }
        }
        System.out.println(count==0?"it is not ":"it is ");

    }
}
