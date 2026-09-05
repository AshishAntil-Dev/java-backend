package Lect5;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        //given three sides of a triangle , check if it's equilateral or isosceles or scalene
        Scanner inpu = new Scanner(System.in);
        System.out.println("first side?");
        int a= inpu.nextInt();
        System.out.println("second side?");
        int b= inpu.nextInt();
        System.out.println("tird side?");
        int c= inpu.nextInt();

        if(a==b && b==c){
            System.out.println(" this is an equilateral triangle");
        }else if (a==b || b==c || a==c ){
            System.out.println("this is an isosceles triangle");
        } else {
            System.out.println(" this is a scalene triangle");
        }
    }
}
