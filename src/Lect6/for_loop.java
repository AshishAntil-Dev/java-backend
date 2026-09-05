package Lect6;

public class for_loop {
    public static void main(String[] args) {

        //task is to print the number from 1 to 10
        // syntax:-- for(declaration;condition;update expression)
        int t=10;
        for(int i=1;i<=10;i++){
            System.out.println("ashish"+i);
        }

        //task is to print number from 15 to 20
        for(int p=15; p<=20;p++){
            System.out.println(p);
        }
        //task is to print the sum of natural number from 1 to 1000
        int sum=0;
        for(int n=1 ; n<=1000;n++){
            sum=sum+n;
        }
        System.out.println(sum);
    }
}
