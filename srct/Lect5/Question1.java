package Lect5;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {

        // write a code
        //take an int type input from the user
        //if the value is even then print "even"
        // if the value is odd then print "odd"
        Scanner input= new Scanner(System.in);
        System.out.println(" enter the number");

        int number= input.nextInt();

        int remainder= number%2;

        if(remainder==0){
            System.out.println("number is even");
        }else {
            System.out.println("number is odd");
        }

        //


    }
}
