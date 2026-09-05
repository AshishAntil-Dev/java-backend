package Lect_47_to_55;

import java.util.ArrayList;
import java.util.List;

public class Lect_49 {
    public List<String> result= new ArrayList<>();
    public static void f(List<String> result,int n, int o, int c , String output){
        //base case
        if (output.length()==n*2){
            result.add(output);
            System.out.println(output);
            return;
        }

        //when opening is greater than closing
        if (o>c){
            f(result,n, o, c+1, output+")");
        }
        if(o<n){
            f(result,n,o+1, c, output+"(");
        }
    }
    public static List<String> pass(int n){
        List<String> result= new ArrayList<>();
        f(result,n,0,0,"");
        return result;
    }
    public static void main(String[] args) {
        pass(3);

    }
}
