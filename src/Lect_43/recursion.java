package Lect_43;

public class recursion {
    public static void main(String[] args) {
        System.out.println(f(5));
    }
    public static int f(int n){
        //base case
        if (n==1) return 1;
        int assumptions=f(n-1);//function works correctly
        return n*assumptions;
    }

}
