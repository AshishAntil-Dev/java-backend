package Revision;

import java.util.Scanner;

public class revision1 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("write your number 1 ");
        int n1=input.nextInt();

        System.out.println("write your number 2 ");
        int n2=input.nextInt();
        System.out.println("write your number 3 ");
        int n3= input.nextInt();
        int d=n1+n2+n3;

        if(d==180 && n1>0 && n2>0 && n3>0){
            System.out.println("numbers give triangle");
        }else {
            System.out.println("numbers doesn't give triangle");
        }

    }
}
