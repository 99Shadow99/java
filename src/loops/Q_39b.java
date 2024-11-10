package loops;

import java.util.Scanner;

public class Q_39b {
    public static void main(String[] args) {
        System.out.println("give the number");
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        int count=0;
        int num2=num;
        while(num2!=0){
            count++;
           num2= num2/10;
        }
        long sq=(long)Math.pow(num,2);
        int sum=0;
       int last=(int)sq%(int)Math.pow(10,count);
        System.out.println(last==num?"it is":"it is not ");
    }
}
