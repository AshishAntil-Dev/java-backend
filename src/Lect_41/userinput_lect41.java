package Lect_41;
import java.util.Scanner;

public class userinput_lect41 {
    public static void main(String[] args) {
        //java provides different ways to get input from the users
        //1. scanner class
        //2. bufferReader class
        //3. console class
        Scanner input = new Scanner(System.in);
        Scanner input1 = new Scanner(System.in);
        System.out.println("enter a number");
        int num= input.nextInt();
        System.out.println("you entered "+num);


        System.out.println("enter a String");
        String mys= input.next();
        System.out.println("you entered "+ mys);


        System.out.println("enter a String");
        String mysa= input1.nextLine();
        System.out.println("you entered "+ mysa);


        input.close();

    }
}
