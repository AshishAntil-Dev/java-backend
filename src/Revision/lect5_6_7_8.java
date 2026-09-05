package Revision;

import java.util.Scanner;

public class lect5_6_7_8 {
    public static void main(String[] args) {
        //check even and odd with if statement
//        Scanner inputnum=new Scanner(System.in);
//        System.out.println("write down the number");
//        int num= inputnum.nextInt();
//        if(num%2==0){
//            System.out.println(num+" is an even number");
//        }else {
//            System.out.println("it is a odd number");
//        }



        //check if given angles can form a triangle or not
//        Scanner input=new Scanner(System.in);
//        System.out.println("write down 1st angle");
//        int a= input.nextInt();
//        System.out.println("write down 2nd angle");
//        int b= input.nextInt();
//        System.out.println("write down 3rd angle");
//        int c= input.nextInt();
//        if(a+b+c==180){
//            System.out.println("yes");
//        }else {
//            System.out.println("no");
//        }



        //check if the given year is a leap year or not
//        Scanner input2=new Scanner(System.in);
//        System.out.println("write down the year");
//        int year=input2.nextInt();
//        int f=year%4;
//        int s=year%100;
//        int t=year%400;
//        if (f==0&&s==0&&t==0){
//            System.out.println(year+" is a leap year");
//        }else if (f==0&&s==0&&t!=0){
//            System.out.println(year+" is not a leap year");
//        }else if (f==0&&s!=0){
//            System.out.println(year+" is a leap year");
//        }else {
//            System.out.println(year + " is not a leap year");
//        }


        //switch statement
//        int num1= 10;
//        String size = "";
//
//        switch (num1){
//            case 10:
//                size="small";
//                break;
//            case 12:
//                size="med";
//                break;
//        }
//        System.out.println(size);

        //switch statement part 2
//        int ashu=55;
//        String pantji=" ";
//
//        switch (ashu){
//            case 45:
//                pantji="chota";
//                break;
//            case 50:
//                pantji="thoda mota";
//                break;
//            case 55:
//                pantji="bhot mota";
//                break;
//        }
//        System.out.println(pantji);



        //do-while statement
//        int n=1;
//        do{
//            System.out.println("hell");
//            n++;
//        }while (n<1);

        //print number from 1 to 90
//        for (int n=1;n<91;n++){
//            System.out.println(n);
//        }

        //print sum of number from 1 to 1000
//        int sum=0;
//        for (int n=0;n<=1000;n++){
//            sum+=n;
//        }
//        System.out.println(sum);

        //print 1 to 10 using while loop
//        int n=10;
//        int i=1;
//        while(i<=10){
//            System.out.println(i);
//            i++;
//        }

        //reverse the number 1234 and print 4321
//        int n=1234;
//        int sol=0;
//        while(n>0){
//            int rem=n%10;
//            sol=sol*10+rem;
//            n=n/10;
//        }
//        System.out.println(sol);

        //given an integer tell if it is prime or not
//        Scanner input61=new Scanner(System.in);
//        System.out.println("write down the num");
//        int num= input61.nextInt();
//        Boolean isprime=true;
//        if(num<=1){
//            isprime=false;
//        }else{
//        for (int i=2;i<num;i++){
//            if (num%i==0){
//                isprime=false;
//                break;
//            }
//        }
//        }
//        if (isprime)
//            System.out.println(num + " is a prime number.");
//        else
//            System.out.println(num + " is not a prime number.");


        //to use continue keyword
//        for (int n=1; n<=10;n++){
//            if (n>4&&n<7){
//                continue;
//            }
//            System.out.println(n);
//        }

        // continue keyword part 2
//        for (int n=0;n<=100;n++){
//            if (n>9&&n<96){
//                continue;
//            }
//            System.out.println(n);
//        }

        //find nth fibonnaci number
//        int n=40;
//        int a=0;
//        int b=1;
//
//        for (int i=0;i<=n;i++){
//            int sum=a+b;
//            a=b;
//            b=sum;
//        }
//
//        System.out.println(b);

        //using ternary operator
//        int marks =25;
//        int subject=7;
//        int tom=5;
//        String result=(marks>20&&subject>6&&tom>5)?"credit earned":"credit not earned";
//        System.out.println(result);

          //typecasting is a method to convert a datatype to another datatype
          //smaller datatype=bigger datatype(not valid)
          //bigger datatype= smaller datatype(valid)
//        char ch='a';
//        System.out.println(ch);
//        System.out.println((int)ch);
//        ch=(char)(ch+1);
//        System.out.println(ch);
//        System.out.println((int)ch);
//        System.out.println(2+"\t"+3);
//        System.out.println("hello"+"\t"+"world");


        //lect_8
        //print
//        *
//        * *
//        * * *
//        * * * *
//        * * * * *
//
//        for(int i=1;i<=5;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }





    }
}
