package practice_3;

import java.util.Scanner;

public class Q_1 {
    public static void main(String[] args) {
        System.out.println("give a number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
      double sqrt=Math.sqrt(n);
      if(sqrt==(int)sqrt){
          System.out.println("it is perfect");
      }
      else{
          System.out.println("it is not");
      }

    }
}
