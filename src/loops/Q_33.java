package loops;

import java.util.Scanner;

public class Q_33 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("give number ");
        int a=sc.nextInt();
        System.out.println("give number power");
        int b=sc.nextInt();
        int sum=1;
        for(int i=1;i<=b;i++){
            sum=sum*a;
        }
        System.out.println(a+" power "+b+"= "+sum);

    }
}
