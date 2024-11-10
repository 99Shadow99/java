package array;

import java.util.Arrays;
import java.util.Scanner;

public class Q_61_2 {
    public static void main(String[] args) {
        System.out.println("give the size ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextByte();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("give the number" + i);
            arr[i] = sc.nextInt();
        }
        int i=0;
        int j=size-1;
        while (i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
