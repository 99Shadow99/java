package array;

import java.util.Scanner;

public class Q_57 {
    public static void main(String[] args) {
        System.out.println("give the size of arr");
        Scanner sc=new Scanner(System.in);
        int size= sc.nextInt();
        int []arr=new int[size];
        for (int i = 1; i < size; i++) {
            System.out.println("give arr value" + i);
            arr[i] = sc.nextInt();
        }
        int count=1;
        for(int i=0;i<size-1;i++){
            if(arr[i]<arr[i+1]){
                count=0;
                break;
            }
        }
        System.out.println(count==0?"it is":"it is not ");
    }
}
