package Lect_47_to_55;

public class Lect_48 {
    public static int f(int n){
        if(n==0) return 1;
        if (n==1) return n;//base case

        int vertical=f(n-1);
        int horizontal=f(n-2);

        return vertical+horizontal;

    }
    public static void main(String[] args) {
        System.out.println(f(5));
    }
}
