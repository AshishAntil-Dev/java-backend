package Lect_38_39_40;

public class Lect_39 {
    public static void main(String[] args) {
        substrings("code");
    }
    public static void substrings(String str){
        int n=str.length();
        for(int si=0;si<n;si++){
            for(int ei=si+1; ei<=n;ei++){
                System.out.println(str.substring(si,ei));
            }
        }
    }

}
