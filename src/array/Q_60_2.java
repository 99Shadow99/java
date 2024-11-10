package array;

import java.util.Arrays;
import java.util.Scanner;

public class Q_60_2 {
    public static void main(String[] args) {
        System.out.println("give the size ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextByte();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("give the number" + i);
            arr[i] = sc.nextInt();
        }
        System.out.println("give the rotation times ");
        int k = sc.nextInt();
        k=k%size;
        while (k>0){
            int temp=arr[0];
            for (int i=0;i<size-1;i++){
                arr[i]=arr[i+1];
            }
            arr[size-1]=temp;
            k--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
