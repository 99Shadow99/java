package pattern;

import java.util.Scanner;

public class Q_47 {
    public static void main(String[] args) {
        System.out.println("give number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        for(int i=1;i<=num;i++){
          for(int j=1;j<=i;j++){
            System.out.print(j+" ");
          }
            System.out.println();
        }

    }
}
