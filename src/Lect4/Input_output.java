package Lect4;

import java.util.Scanner;

public class Input_output {
    public static void main(String[] args) {
        System.out.println("hello");

        System.out.println("I am " +"coolllll");
        System.out.println("number"+ 10);

        // create an object of scanner class
        Scanner input= new Scanner(System.in);

        System.out.println("enter an integer value");

        //take input from user
        int number= input.nextInt();
        System.out.println("enter str");
        input.nextLine();   //after next int there can be no nextline  due to  /n residue from nextint() , so we must give this nextline so it can affect and skip it instead of main code string next line
        String str= input.nextLine();

        System.out.println("you entered:  " + number);
        System.out.println("your char" + str);

        System.out.println("enter a float number");

        float myfloat=input.nextFloat();
        System.out.println("you entered: " + myfloat);

        System.out.println("enter a double number");

        double mydouble= input.nextDouble();

        System.out.println("you entered"+ mydouble);







        //next() --> read a word from the user
        //nextLine()-->read a line of text from user

    }
}
