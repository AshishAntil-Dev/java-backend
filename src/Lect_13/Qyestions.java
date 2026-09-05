package Lect_13;

import com.sun.security.jgss.GSSUtil;

public class Qyestions {
    public static void main(String[] args) {
        //print squares of numbers 1 to 10
        for(int i=1; i<=10;i++){
            int res= getsquare(i);
            System.out.println("the sqaure of "+ i +" is :"+res);
        }




        System.out.println("-------CASE1-------");
        int one=10;
        int two=20;

        int sum= scopes(one,two);
        System.out.println(sum);


        System.out.println("------CASE2-------");
        System.out.println(one + "," + two);
        swap(one,two);
        System.out.println(one + ","+ two);
        
    }
    public static void swap(int one, int two) {
        System.out.println(one + "," + two);
        int temp = one;
        one = two;
        two = temp;
        System.out.println(one + "," + two);
    }
    public static int scopes(int one,int another){
        int sum= one+another;
        return sum;

    }
    public static int getsquare(int x){
        return x*x;
    }

}
//java uses pass by value method and doesn't support pass by reference method
//pass by reference method is supported by the c++ and other such languages
