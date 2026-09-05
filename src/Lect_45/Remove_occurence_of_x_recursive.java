package Lect_45;

public class Remove_occurence_of_x_recursive {
    public  static void f(String str, int idx){
        if (idx>=str.length()) return;

        if (str.charAt(idx)!='x'){
            System.out.print(str.charAt(idx));
        }


        f(str,idx+1);
    }
    public static void main(String[] args) {
        String str="abcxxehhjxkjhkjxhkjxhkjxchkjxchxj";
              f(str,0);
    }
}
