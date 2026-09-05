package Lect5;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        //given a year we have to check whether it's leap year or not

        Scanner tm= new Scanner(System.in);
        System.out.println("write down the year");

        int year= tm.nextInt();

        int fc= year%4;
        int sc= year%100;
        int tc= year%400;

        if(fc==0 && sc==0 && tc==0 ){
            System.out.println( year+" is a leap year");
        }else if (fc==0 && sc==0 && tc!=0){
            System.out.println( year + " is not a leap year");
        } else if (fc==0 && sc!=0){
            System.out.println(year + " is a leap year");
        }else {
            System.out.println("this is not a leap year");
        }
    }
}
