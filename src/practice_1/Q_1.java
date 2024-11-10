package practice_1;

import java.util.Scanner;

public class Q_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("give amt");
         int amt= sc.nextInt();
         int a500n=0;
        int a200n=0;
        int a100n;
        int a50n;
        int a20n;
        int a10n;
        int a5n;
        int a2n;
        int a1n;
        if(amt>=500){
           a500n= amt/500;
           amt=amt-(a500n*500);
        }
        if(amt>=200){
            a200n= amt/200;
            amt=amt-(a200n*500);
        }
        if(amt>=100){
            a100n= amt/100;
            amt=amt-(a100n*100);
        }
        if(amt>=50){
            a50n= amt/50;
            amt=amt-(a50n*50);
        }
        if(amt>=20){
            a20n= amt/20;
            amt=amt-(a20n*20);
        }
        if(amt>=10){
            a10n= amt/10;
            amt=amt-(a10n*10);
        }
        if(amt>=5){
            a5n= amt/5;
            amt=amt-(a5n*5);
        }
        if(amt>=2){
            a2n= amt/2;
            amt=amt-(a2n*2);
        }
        if(amt>=1){
            a1n= 1;

        }
        System.out.println("a500n "+ a500n);



















    }
}
