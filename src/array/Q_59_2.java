package array;

import java.util.Arrays;
import java.util.Scanner;

public class Q_59_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("give size of array ");
        int size=sc.nextInt();
        int []arr=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("give the arry"+i);
            arr[i]=sc.nextInt();

        }
        int temp=arr[0];
        for(int i=0;i<size-1;i++){
            arr[i]=arr[i+1];
        }
        arr[size-1]=temp;
        System.out.println(Arrays.toString(arr));
    }

}
