package Lect_45;

public class Remove_occurence_x_approach2 {
    public  static void f(String str, int idx,String output){
        if (idx>=str.length()){
            System.out.println(output);
            return;
        }

        if (str.charAt(idx)!='x'){
            f(str,idx+1,output+=str.charAt(idx));
        }else {
            f(str, idx+1, output);
        }



    }
    public static void main(String[] args) {
        String str="abcxxehhjxkjhkjxhkjxhkjxchkjxchxj";
        f(str,0,"");
    }
}
