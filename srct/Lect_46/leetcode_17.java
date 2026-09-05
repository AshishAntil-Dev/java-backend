package Lect_46;

import java.util.ArrayList;
import java.util.List;

public class leetcode_17 {
    public static String map[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    public static List<String> result = new ArrayList<String>();//it is a global list array and once some entry is done in it , it can be
    public static void f(String str,int idx,String output){
        //base case
        if (idx==str.length()){
            result.add(output);
            return;
        }

        int digit=str.charAt(idx)-'0';
        for (int k=0;k<map[digit].length();k++){
            f(str,idx+1,output+map[digit].charAt(k));
        }

    }
    public static List<String> main(String[] args) {
        result.clear();// used bcoz result is global array and once something is added to it , it will get appended at new entry but not cleared and gives an error
        f("23",0,"");
        return result;

    }
}
