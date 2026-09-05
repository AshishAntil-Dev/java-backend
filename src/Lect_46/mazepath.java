package Lect_46;

public class mazepath {
    public static int count=0;//global variable
    public static void f(int i, int j, int m, int n, String output){
        if(i==m-1&&j==n-1){
            System.out.println(output);
            count++;
            return;
        }
        if (i>=m||j>=n) return;
        f(i,j+1,m,n,output+"R");
        f(i+1,j,m,n,output+"D");
    }
    public static void main(String[] args) {
        count=0;
        int m=3 , n=3;
        f(0,0,m,n,"");
    }
}
