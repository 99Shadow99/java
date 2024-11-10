package Do_while_switch;

import java.util.Scanner;

public class Q_41 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc= new Scanner(System.in);
        do {
            System.out.println("enter 1-for add");
            System.out.println("enter 2-for sub");
            System.out.println("enter 3-for multiplication");
            System.out.println("enter 4-for divide");
            System.out.println("enter 5-for modulus");
            System.out.println("enter 6-for END");
            c=sc.nextInt();
            if(c==6)break;
            System.out.println("enter a value");
            a=sc.nextInt();
            System.out.println("enter b value");
            b=sc.nextInt();
            switch (c){
                case 1:
                    System.out.println("a+b="+(a+b));
                    break;
                case 2:
                    System.out.println("a-b="+(a-b));
                    break;
                case 3:
                    System.out.println("a*b="+(a*b));
                    break;
                case 4:
                    System.out.println("a/b="+(a/b));
                    break;
                case 5:
                    System.out.println("a%b="+(a%b));
                    break;
                default:
                    System.out.println("End");
                    break;
            }
        }while (c!=6);
    }
}
