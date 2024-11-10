package Do_while_switch;

import java.util.Scanner;

public class Q_42b {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("give day number ");
        int num =sc.nextInt();
        String ans="";
        ans=switch (num){
            case 1->{
               yield  "Monday";
            }
            case 2->{
              yield  "Tuesday ";
            }
            case 3->{
                yield  "Wednesday, ";
            }
            case 4->{
                yield "Thursday, ";
            }
            case 5->{
                yield  "Friday ";
            }
            case 6->{
                yield  "Saturday ";
            }
            case 7->{
                yield  "Sunday";
            }

            default->{
                yield  "End";
            }


        };
        System.out.println(ans);


    }
}
