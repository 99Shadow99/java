package loops;

import java.util.Scanner;

public class Q_26 {
    public static void main(String[] args) {
        System.out.println("give a number");
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(a+"*"+i+"="+(a*i));
        }

    }
}
