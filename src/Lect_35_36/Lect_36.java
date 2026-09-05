package Lect_35_36;

public class Lect_36 {
    public static void main(String[] args) {
        //check if it is palindrome or not
        String str="nitin";
        System.out.println(isPalindrome(str));
        
    }
    public static boolean isPalindrome(String str){
        int left=0;
        int right=str.length()-1;

        while(left<right){
            if (str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;

    }

}
