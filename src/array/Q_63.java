package array;

import java.util.Scanner;

public class Q_63 {
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
        int num=sc.nextInt();
        int start=0;
        int end=size-1;
        int mid=(start+end)/2;
        System.out.println("mid is "+mid );
        while (start <= end) {
            if (num>arr[mid]){
                System.out.println("number is h so mid change ");
                start=mid+1;
                mid=(start+end)/2;
                System.out.println(mid);

            }
            if (num<arr[mid]){
                System.out.println("number is h so mid change ");
                end=mid-1;
                mid=(start+end)/2;
                System.out.println(mid);


            }
            if(arr[mid]==num){
                count=true;
                break;
            }

        }

        System.out.println(count?"found":"not found");



    }
}
