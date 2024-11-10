package array;

import java.util.Scanner;

public class Q_EX_1 {
    public static void main(String[] args) {
        System.out.println("give arr size");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int []arr=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("give the value"+i);
            arr[i]=sc.nextInt();
        }
        int count=0;
        int tra=12;
        for(int i=0;i<size;i++){
            int sum=0;
            for(int j=i;j<size;j++){
                sum=sum+arr[j];
                if(sum==tra)count++;
            }
        }
        System.out.println("arry is"+ count);
    }
}
