package Lect5;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        //givem three integers we have to find out the maximum
        Scanner intu= new Scanner(System.in);
        System.out.println("write down no.1");

        int a = intu.nextInt();
        System.out.println("wrtie down no.2");
        int b= intu.nextInt();
        System.out.println("wrtie down no.3");
        int c= intu.nextInt();

        if (a>b && b>c){
            System.out.println(a+" is the maximum integer value");
        }else if (b>a && b>c){
            System.out.println(b+" is the maximum integer value");
        }else{
            System.out.println(c+" is the maximum integer value");
        }
    }
}
