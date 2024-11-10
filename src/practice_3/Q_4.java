package practice_3;

import java.util.Scanner;

public class Q_4 {
    public static void main(String[] args) {
        System.out.println("give number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int even=0;
        int odd=0;
        for(int i=1;i<=num;i++){
            if(i%2==0)even+=i;
            else odd+=i;
        }
        System.out.println("even sum"+even);
        System.out.println("odd sum"+odd);
    }
}
