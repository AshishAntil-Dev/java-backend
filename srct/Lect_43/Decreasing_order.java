package Lect_43;

public class Decreasing_order {
    public static void main(String[] args) {
        f(4);

    }
    public static void f(int n){
        if (n==0) {
            return;//do nothing as 0 is not a natural number

        }
        System.out.println(n);
        f(n-1);

    }
}
