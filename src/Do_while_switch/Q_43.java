package Do_while_switch;

import java.util.Scanner;

public class Q_43 {
    public static void main(String[] args) {
        System.out.println("give the char");
        Scanner sc=new Scanner(System.in);
        char a=sc.next().charAt(0);
        switch (a){
            case 'a','e','i','o','u'->{
                System.out.println("vowel");
            }
            default -> {
                System.out.println("consonant");
            }
        }


    }
}
