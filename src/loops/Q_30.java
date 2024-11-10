package loops;

import java.util.Scanner;

public class Q_30 {
    public static void main(String[] args) {
        System.out.println("give number");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=1;i<a;i++){
            if(a%i==0){
                System.out.println(" fact is ="+i);
            }
        }
    }
}
