package Lect_47_to_55;

public class lect47 {
    public static Integer f(int n){
        if (n<=2) return n;//base case

        int single = f(n-1);

        int pair=(n-1)*f(n-2);

        return single+pair;
    }
    public static void main(String[] args) {

        System.out.println(f(2));

    }
}
