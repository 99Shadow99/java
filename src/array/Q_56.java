package array;

import java.util.Scanner;

public class Q_56 {
    public static void main(String[] args) {

        System.out.println("give size of arr");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int []arr=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("give the array value"+i);
            arr[i]=sc.nextInt();
        }
        int great=arr[0];
        for(int i=0;i<size;i++){
            if(arr[i]>great)great=arr[i];
        }
        int great2=arr[0];
        for(int i=0;i<size;i++){
            if(arr[i]>great2&&arr[i]!=great){
                great2=arr[i];
            }
            if(great2==great){
                great2=arr[i+1];
            }
        }
        System.out.println("second great is="+great2);
    }
}
