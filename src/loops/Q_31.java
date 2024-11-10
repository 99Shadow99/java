package loops;

import java.util.Scanner;

public class Q_31 {
    public static void main(String[] args) {
        System.out.println("give number ");
        Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            int sum=0;
            for(int i=1;i<=num;i++){
                if(num%i==0){
                    if(i==num){
                        System.out.print(i+"");
                    }
                    else {
                        System.out.print(i+"+");
                    }
                    sum=sum+i;

                }

            }
        System.out.println("="+sum);

    }
}
