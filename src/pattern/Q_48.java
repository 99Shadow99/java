package pattern;

import java.util.Scanner;

public class Q_48 {
    public static void main(String[] args) {
        System.out.println("give the number");
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=1;i<=num;i++){
            for (char ch = 'A'; ch <=(char)(65+i); ch++) {
                System.out.print(ch + " ");
            }

            System.out.println();
        }
    }
}
