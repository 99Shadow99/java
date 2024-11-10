package loops;

import java.util.Scanner;

public class Q_29 {
    public static void main(String[] args) {
        System.out.println("give number");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int sumOdd=0;
        int sumEven=0;
        for(int i=1;i<n;i++){
            if(i%2==0){
                sumEven=sumEven+i;
            }
            else {
                sumOdd+=i;
            }
        }
        System.out.println("odd sum ="+sumOdd);
        System.out.println("even sum ="+sumEven);
    }
}
