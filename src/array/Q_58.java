package array;

import java.util.Scanner;

public class Q_58 {
    public static void main(String[] args) {
        System.out.println("give size of array");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int []arr=new  int [size];


        for(int i=0;i<size;i++){
            System.out.println(" array value "+i);
            arr[i]=sc.nextInt();

        }
        int []arr2=new  int [size];
        int size2=size-1;
        for(int i=0;i<size;i++){
            arr2[i]=arr[size2];
            size2--;
        }
        for(int i=0;i<size;i++){
            System.out.println(arr2[i]);
        }
    }
}
