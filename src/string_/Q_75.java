package string_;

import java.util.Scanner;

public class Q_75 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String name=sc.nextLine();
        int count=0;
        for(int i=0;i<name.length()-1;i++){

            if(name.charAt(i)=='a'||name.charAt(i)=='i'||name.charAt(i)=='e'||name.charAt(i)=='o'||name.charAt(i)=='u'){
                count++;
            }

        }
        System.out.println("vowel is = "+count);
    }
    
}
