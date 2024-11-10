package array;

import java.util.Arrays;
import java.util.Scanner;

public class Q_66 {
    public static void main(String[] args) {
        System.out.println("give arr size");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int []arr=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("give the value"+i);
            arr[i]=sc.nextInt();
        }
        // 1,3 73,2,
        // 1,2,3,73
        for(int i=1;i<size;i++){
            for(int j=0;j<size-i;j++){
                if(arr[j]>arr[j+1]){
                    int tem=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tem;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
