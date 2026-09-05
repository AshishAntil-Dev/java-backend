package Lect_38_39_40;

public class Lect_40part3 {
    public static void main(String[] args) {
        //leetcode ques 125
        //palindrome phrase
        System.out.println(palin(""));

    }
    public static boolean palin(String s){

        for (int i=0,j=s.length()-1;i<j;i++,j--){
            while(i<j && !Character.isLetterOrDigit(i)){
                i++;
            }
            while(i<j && !Character.isLetterOrDigit(j)){
                j--;
            }
            if (Character.toLowerCase(s.charAt(i))!=Character.toLowerCase(s.charAt(j))){
                return false;
            }

        }

        return true;

    }
}
