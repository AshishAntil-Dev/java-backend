package Lect5;

import java.util.Scanner;

public class Question2{
    public static void main(String[] args) {
        //write a code to check if three given angles can from a triangle or not

        Scanner tri=new Scanner(System.in);
        System.out.println("first angle?");

        int a= tri.nextInt();

        System.out.println("second angle?");

        int b= tri.nextInt();

        System.out.println("third angle?");

        int c = tri.nextInt();

        int d= a+b+c;

        if (d==180 && a>0 && b>0 && c>0){
            System.out.println("triangle can be formed");
        }else {
            System.out.println("triangle can't be formed");
        }
    }
}
