package loops;

import java.util.Scanner;

public class Q_32 {
    public static void main(String[] args) {
        System.out.println("give number");
        Scanner sc = new Scanner(System.in);
        int p=sc.nextInt();
        int count=0;
        for(int i=1;i<=p;i++){
            if(p%i==0){
                count++;
            }
        }
        System.out.println(count==2?"prime":"not prime");

    }
}
