package Lect_46;

import java.util.ArrayList;
import java.util.List;

public class leetcode_386 {
    public static List<Integer> result= new ArrayList<Integer>();
    public static void f(int i,int n){
         if (i<=n){
             result.add(i);
         }else {
             return;
         }

        for (int k=0;k<=9;k++){
            if (i==0&&k==0) continue;
            f(10*i+k,n);
        }
    }
    public static void main(String[] args) {
        f(0,5);

    }
}
