package Revision;

import java.util.Scanner;

public class lect1_2_3_4 {
    public static void main(String[] args) {

        boolean flag=true;
        System.out.println(flag);

        //adding syntax
        int sum=25;
        int val=25;
        sum+=val;
        System.out.println(sum);

        //logical operators
        System.out.println(2>5||5>2);
        System.out.println(50==20);

        //input output
        System.out.println("hello");
        Scanner Input= new Scanner(System.in);
        System.out.println("write down the number");
        int man= Input.nextInt();;
        System.out.println(man);

        //revision of input
        Scanner tusk= new Scanner(System.in);
        System.out.println("write down the number");
        int vit= tusk.nextInt();
        System.out.println("you typed "+ vit);

        //revision of input taking
        Scanner ashiheight= new Scanner(System.in);
        System.out.println("enter your height in cm");
        int height=ashiheight.nextInt();
        double heightinfeet=height*0.0328084;
        System.out.println("your height in feet is:");
        System.out.println(heightinfeet);

        //revision of input taking
        Scanner input2=new Scanner(System.in);
        System.out.println("write down her weight in kg");
        double weight=input2.nextDouble();
        System.out.println("write down your height in metre");
        double heigh= input2.nextDouble();
        double bmi=weight/(heigh*heigh);
        System.out.println(bmi);



    }

}
