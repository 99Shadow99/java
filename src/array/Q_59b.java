package array;

import java.util.Scanner;

public class Q_59b {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("give size of array ");
        int size=sc.nextInt();
        int []arr=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("give the arry"+i);
            arr[i]=sc.nextInt();

        }
        int save=arr[size-1];
        for (int i=size-1;i>=1;i--){

         arr[i]=arr[i-1];

        }
        arr[0]=save;
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }
    }
}
