package array;

import java.util.Arrays;
import java.util.Scanner;

public class Q_63_2 {
    public static void main(String[] args) {
        System.out.println("give the size of array");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int []arr=new int[size];
        for(int i=0;i<size;i++){
            System.out.print("give arr "+i+" ");
            arr[i]=sc.nextInt();
        }
        System.out.println("give the number");
        boolean count=false;
        int key=sc.nextInt();
        int start=0;
        int end=size-1;
        int midIndex;
        int index=-1;
        Arrays.sort(arr);
        while (start<=end){
            midIndex=(start+end)/2;
            if(arr[midIndex]==key){
                index=midIndex;
                break;
            }
            if(key<arr[midIndex]){
                end=midIndex-1;
            }
            else{
                start=midIndex+1;
            }
        }
        System.out.println(index==-1?"not found":"found at index "+index);
    }
}
