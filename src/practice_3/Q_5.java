package practice_3;

import java.util.Scanner;

public class Q_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("give number n");
        int n=sc.nextInt();
        System.out.println("give number x");
        int x=sc.nextInt();
        int count=0;

        for(int i=1;i<=n;i++){
            int temp=1;
            for(int j=1;j<=i/2;j++){
                if(i%j==0){
                    temp++;
                }
            }
            if(x==temp)count++;
        }

        System.out.println("number is "+count);

    }
}
