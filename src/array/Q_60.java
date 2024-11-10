package array;

import java.util.Scanner;

public class Q_60 {
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
        for (int i = 1; i <= k; i++) {
            int save = arr[0];
            for (int j = 0; j < size - 1; j++) {
                arr[j] = arr[j + 1];

            }
            arr[size - 1] = save;
        }

        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);

        }


    }
}
