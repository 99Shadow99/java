package loops;

import java.util.Scanner;

public class Q_25 {
    public static void main(String[] args) {
        System.out.println("giv number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n;i>=1;i--){
            System.out.println("i= "+i);
        }
    }
}
