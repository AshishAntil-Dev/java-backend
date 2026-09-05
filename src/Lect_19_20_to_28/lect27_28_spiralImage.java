package Lect_19_20_to_28;

import java.util.ArrayList;
import java.util.List;

public class lect27_28_spiralImage {
    public static void main(String[] args) {
        //print matrix elements in spiral way
        // leetcode question 54
        int[][] matrix=new int[3][3];
        matrix[0][0]=1;
        matrix[0][1]=2;
        matrix[0][2]=3;
        matrix[1][0]=4;
        matrix[1][1]=5;
        matrix[1][2]=6;
        matrix[2][0]=7;
        matrix[2][1]=8;
        matrix[2][2]=9;

        display(matrix);
        System.out.println(spiral(matrix));
    }
    public static List<Integer> spiral(int[][] arr){
        int m=arr.length;//no. of rows
        int n=arr[0].length;//no. of columns
        int sr=0;
        int ec=n-1;
        int er=m-1;
        int sc=0;
        List<Integer> res= new ArrayList<>();
        int count=m*n;
        while (count>0){
            //sr
            for (int i=sc;i<=ec;i++){
                res.add(arr[sr][i]);
                count--;
            }
            sr++;
            if (count==0)break;

            //ec
            for (int i=sr;i<=er;i++){
                res.add(arr[i][ec]);
                count--;
            }
            ec--;
            if (count==0)break;

            //er
            for (int i=ec;i>=sc;i--){
                res.add(arr[er][i]);
                count--;
            }
            er--;
            if (count==0)break;

            //sc
            for (int i=er;i>=sr;i--){
                res.add(arr[i][sc]);
                count--;
            }
            sc++;
            if (count==0)break;
        }

        return  res;

    }

    public static void display(int[][] arr){
        int n=arr.length;
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
