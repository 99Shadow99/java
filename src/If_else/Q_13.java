package If_else;

import java.util.Scanner;

public class Q_13 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        char gender=sc.next().charAt(0);
        if(gender=='m'||gender=='M'){
            System.out.println(" Good Morning Sir");
        }
        else{
            System.out.println("good morning maam");
        }
    }
}
