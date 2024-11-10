package If_else;

import java.util.Scanner;

public class Q_18 {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println(" give number 1");
    int a=sc.nextInt();
        System.out.println("give number 2");
    int b=sc.nextInt();
        System.out.println("give number 3");
        int c=sc.nextInt();

        if(a>b&&a>c){
            System.out.println("a is greater");
        }
        else if (b>a&&b>c) {
            System.out.println("b is greater");
        }
        else if (c>b&&c>a) {
            System.out.println("c is greater");
        }
        else {
            System.out.println("error");
        }

    }
}
