package loops;

import java.util.Scanner;

public class Q_38 {
    public static void main(String[] args) {
        System.out.println("give a number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int num2=num;
        int sum=0;
        while(num2!=0){
            int rem=num2%10;
            int fact=1;
            for(int i=1;i<=rem;i++){
                fact=fact*i;
            }
            sum=sum+fact;
            num2=num2/10;
        }
        System.out.println(num==sum?"it is ":"it is not");
    }
}
