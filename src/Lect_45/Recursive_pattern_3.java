package Lect_45;

public class Recursive_pattern_3 {
    public static void f(int row,int col, int n){
        if (row>n) return;//all rows are printed
        if (col>n-row+1){//we just changed how cols are printed
            System.out.println();//move to next line
            f(row+1, col=1, n);//all column of given row are done, move to next row
            return;
        }
        System.out.print("*");
        f(row, col+1, n);//moves to next column

    }
    public static void main(String[] args) {
        f(1,1,5);

    }
}
