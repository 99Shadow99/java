package array;

import java.util.Arrays;
import java.util.Scanner;

public class Q_64 {
    public static void main(String[] args) {
        System.out.println("give arr size");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int []arr=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("give the value"+i);
            arr[i]=sc.nextInt();
        }
        int []arr2=new int[size];
        int j=0;
        for(int i=0;i<size;i++){
            if(arr[i]<0)arr2[j++]=arr[i];
        }
        for(int i=0;i<size;i++){
            if(arr[i]>0)arr2[j++]=arr[i];
        }
        System.out.println(Arrays.toString(arr2));
    }
}
