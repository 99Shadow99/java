package array;

import java.util.Scanner;

public class Q_55 {
    public static void main(String[] args) {
        System.out.println("give size of array");
        Scanner sc =new Scanner(System.in);
        int size=sc.nextInt();


        int []arr=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("give array value"+(i+1));
            arr[i]=sc.nextInt();

        }
        int great=0;
        for(int i=0;i<size;i++){
            if(arr[i]>arr[great])great=i;
        }
        System.out.println("great of array is="+arr[great]+"index of"+great);

    }
}
