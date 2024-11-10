package string_;

import java.util.Scanner;

public class Q_73 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        int i=0;
        int j=name.length()-1;
        boolean isP=true;
        while (i<j){
            System.out.println(i);
            if(name.charAt(i)!=name.charAt(j)){
                isP=false;
                break;
            }
            i++;
            j--;
        }
        System.out.println(isP?"it is":"it is nnot");
    }
}
