package Lect_31_32_33_34;

import java.util.Arrays;

public class Lect_33 {
    public static void main(String[] args) {
        //leetcode question no.881
        int[] arr={3,2,2,1};
        System.out.println(Boat(arr,3));



    }
    public static int Boat(int[] arr, int limit){
        Arrays.sort(arr);//it sorts out the array in ascending order
        int res=0;
        int i=0;
        int j= arr.length-1;
        while (i<=j){
            res++;
            int sum=arr[i]+arr[j];
            if (sum<=limit){
                i++;
            }
            j--;
        }
        return res;

    }
    public static void display(int[] arr){
        int n= arr.length;
        for (int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
}
