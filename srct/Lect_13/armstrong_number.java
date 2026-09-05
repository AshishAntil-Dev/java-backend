package Lect_13;

import java.util.Scanner;

public class armstrong_number {
    public static void main(String[] args) {
        // a positive integer is called as armstrong number if number abc
        //abc= a^n+b^n+c^n  where n is the number of digits in the number
        //153= 1^3 + 5^3 + 3^3
        // Question is :- Given an input , print true or false if it is an armstrong number or not
        //153--> true
        //570 --> false
        //1634--> true

        System.out.println("type down the number");
        Scanner tut= new Scanner(System.in);
        int num= tut.nextInt();
        System.out.println(isArmstrong(num));


        System.out.println("type down the range for printing the armstrong numbers");
        System.out.println("type down the lo limit");
        int lo=tut.nextInt();
        System.out.println("type down the high limit");
        int high=tut.nextInt();

        printarmstrongnumbers(lo,high);
    }
    public static void printarmstrongnumbers(int lo,int high){

        for (int n=lo; n<=high;n++){
            boolean res= isArmstrong(n);
            if(res==true){
                System.out.println(n);
            }
        }


    }
    public static boolean isArmstrong(int num){
        int nod=countDigit(num);
        int on= num;
        int sum=0;

        while(num>0){
            int rem= num%10;
            sum += Math.pow(rem,nod);
            num=num/10;
        }
        return sum==on;
    }
    public static int countDigit(int num){
        int nod=0;

        while(num>0){
            num= num/10;
            nod++;
        }
        return nod;
    }
}
