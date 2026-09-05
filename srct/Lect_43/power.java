package Lect_43;

public class power {
    public static int f(int a, int b){
        if (b==0) return 1;
        return a*f(a,b-1);

    }
    public static void main(String[] args) {
        //for integer values a and b , write a recursive function to implement a^b
        System.out.println(f(3,4));

    }
}
