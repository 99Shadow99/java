package string_;

import java.util.Scanner;

public class Q_72 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String name=sc.nextLine();
        for(int i=name.length()-1;i>=0;i--){
            System.out.println(name.charAt(i));
        }

    }
}
