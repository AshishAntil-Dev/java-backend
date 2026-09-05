package Lect_38_39_40;

public class Lect_40part4 {
    public static void main(String[] args) {
        //leetcde ques 1903
        System.out.println(largestoddnumber("5263788"));
    }
    public static String largestoddnumber(String num){
        for (int i=num.length()-1;i>=0;i--)
            if (num.charAt(i) % 2 != 0) return num.substring(0, i + 1);
             return " ";
    }
}
