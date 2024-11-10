package array;

import java.util.Scanner;

public class Q_67 {
    static boolean strong(){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int num2=num;
        int sum=0;
        while (num2!=0){
            int rem=num2%10;
            int fact=1;
            for(int i=1;i<=rem;i++){
                fact=fact*i;
            }
            sum=fact+sum;
            num2=num2/10;
        }
       return sum==num;

    };
    public static void main(String[] args) {
        System.out.println("give the value");
        System.out.println(Q_67.strong()?"it is":"it is not");

    }
}
