package Lect_45;

public class Recursive_pattern_1 {
    public static void PrintPatternforgivenrow(int n,int totalstars){
        for (int i=0;i<totalstars;i++){
            System.out.print("*");
        }
        System.out.println();
    }
    public static void f(int n, int totalstars){
        if (n<=0) return;
        PrintPatternforgivenrow(n,totalstars);
        f(n-1,totalstars);
    }
    public static void main(String[] args) {
        f(5,5);

    }
}
