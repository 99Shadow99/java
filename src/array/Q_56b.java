package array;

import java.util.Scanner;

public class Q_56b {
    public static void main(String[] args) {
        System.out.println("give array size");
        Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();
        int []arr=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("give array value"+i);
            arr[i]=sc.nextInt();
        }
        int f=Math.max(arr[0],arr[1]);
        int s=Math.min(arr[0],arr[1]);

        for(int i=2;i<size;i++){
            if(f<arr[i]){

                s=f;
                f=arr[i];
            }
            else if(s<arr[i]){
                s=arr[i];
            }
        }
        System.out.println("s greatest is= "+s);
    }
}
