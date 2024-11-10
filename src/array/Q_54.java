package array;

import java.util.Scanner;

public class Q_54 {
    public static void main(String[] args) {
        System.out.println("give array size");
        Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();
      int []arr=new int[size];
      for(int i=0;i<size;i++){
          System.out.println("give array value"+i);
          arr[i]=sc.nextInt();
      }
      int sum=0;
      for (int i=0;i<size;i++){
         sum=sum+arr[i];
      }
        System.out.println("array avg ="+sum/(double)size);
    }

}
