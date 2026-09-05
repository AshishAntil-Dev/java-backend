package Lect_45;

public class Recursive_pattern_1_approach2 {
    public static void g(int n){
        if(n<=0) return;//base case
        System.out.print("* ");
        g(n-1);

    }
    public static void f(int n, int totalstars){
        if (n<=0) return;
        g(totalstars);
        System.out.println();
        f(n-1,totalstars);
    }
    public static void main(String[] args) {
        f(5,5);

    }
}
