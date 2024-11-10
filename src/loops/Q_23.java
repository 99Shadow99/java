package loops;

import java.util.Scanner;

public class Q_23 {
    public static void main(String[] args) {
        System.out.println("give number ");
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int i=1;
        for (i=1;i<=a;++i){
            System.out.println(i);
        }
        System.out.println("i= "+i);
    }
}
