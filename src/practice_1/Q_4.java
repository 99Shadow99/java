package practice_1;

import java.util.Scanner;

public class Q_4 {
    public static void main(String[] args) {
        System.out.println("give the number");
        Scanner sc= new Scanner(System.in);

      long isbn=sc.nextInt();
        int count=0;
      long isbn2=isbn;
        while (isbn2!=0){
            count++;
           isbn2=isbn2/10;
        }
        int sum=0;
        isbn2=isbn;
        if(count==10){
            for(int i=10;i>=1;i--){
                long rem=isbn2%10;
             sum=(int)(sum+(rem*i));
             isbn2=isbn2/10;
            }
        }
        if(count==10){
            System.out.println(sum%11==0?"it is isbn":"it is not isbn");
        }
        else{
            System.out.println("not is isbn");
        }

    }
}
