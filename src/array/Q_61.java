package array;

import java.util.Scanner;

public class Q_61 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("give size of arr");
        int size=sc.nextInt();
        int []arr=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("give the num"+i);
            arr[i]=sc.nextInt();

        }
        int j=size-1;
        for(int i=0;i<=(size-1)/2;i++){
           int temp=arr[i];
           arr[i]=arr[j];
           arr[j]=temp;
           j--;
        }
        for(int i=0;i<size;i++){
            System.out.println("give arr"+arr[i]);

        }




    }

}
