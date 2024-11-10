package If_else;

import java.util.Scanner;

public class Q_14 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println(" give gender");
        char gender=sc.next().charAt(0);
        if(gender=='m'||gender=='M'){
            System.out.println(" Good Morning Sir");
        }
        else if(gender=='f'||gender=='F'){
            System.out.println("good morning maam");
        }
        else{
            System.out.println(" Wrong Input");
        }
    }
}
