package lect_16;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Question {
    public static void main(String[] args) {
        //intersection of arrays(sorted)
        //10,19,20,30,40,40,40,50
        //15,16,17,18,20,25,30,30,40

        int[] arr1={10,19,20,30,40,40,40,50};
        int[] arr2={15,16,17,18,20,25,30,30,40};
        System.out.println(Intersection(arr1,arr2));

    }
    public static ArrayList<Integer> Intersection(int[] one,int[] two){
        ArrayList<Integer> ans= new ArrayList<>();

        int i=0;
        int j=0;

        while (i<one.length&& j<two.length){
            if (one[i]>two[j]){
                j++;
            }else if (one[i]<two[j]){
                i++;
            }else {
                ans.add(one[i]);
                i++;
                j++;
            }
        }

        return ans;

    }
}
