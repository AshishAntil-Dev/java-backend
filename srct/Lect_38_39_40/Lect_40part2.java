package Lect_38_39_40;

import java.util.*;

public class Lect_40part2 {
    public static void main(String[] args) {
        //leetcode ques 151
        String arr="  the sky is blue ";
        System.out.println(reversewords(arr));
    }
    public static String reversewords(String s){
        s=s.trim();//this trim function will take away all the leading and trailing spaces
        List<String> wordlist= Arrays.asList(s.split("\\s+"));//convert the string of characters in to an array of each single character
        Collections.reverse(wordlist);

        return String.join(" ",wordlist);
    }
}
