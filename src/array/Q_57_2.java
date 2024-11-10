package array;

import java.util.Scanner;

public class Q_57_2 {
    public static void main(String[] args) {
        System.out.println("give the size of arr");
        Scanner sc=new Scanner(System.in);
        int size= sc.nextInt();
        int []arr=new int[size];
        for (int i = 1; i < size; i++) {
            System.out.println("give arr value" + i);
            arr[i] = sc.nextInt();
        }
        boolean isSorted=true;
        for(int i=0;i<size-1;i++){
            if(arr[i]>arr[i+1]){
                isSorted= false;
                break;
            }
        }
        System.out.println(isSorted?"sorted":"not sorted");

    }
}
