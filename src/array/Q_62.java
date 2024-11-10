package array;

import java.util.Scanner;

public class Q_62 {
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
        int num=sc.nextInt();
        boolean count=false;
        int index=0;
        for(int i=0;i<size;i++){
            if(num==arr[i]){
                count=true;
                index=i;
                break;
            }
        }
        System.out.println(count?"found at index ="+index:"-1");
    }
}
