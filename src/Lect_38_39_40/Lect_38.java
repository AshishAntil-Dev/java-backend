package Lect_38_39_40;

public class Lect_38 {
    public static void main(String[] args) {
        //it is called as replace ascii
        System.out.println(replaceascii("cdEfG"));

    }
    public static String replaceascii(String str){
        StringBuilder sb=new StringBuilder(str);
        for (int i=0;i<sb.length();i++){
            char ch= sb.charAt(i);

            if (i%2==0){
                ch= (char)(ch+1);//typecasting is used here
                //ascii value of that character is taken and then 1 is added to it
                sb.setCharAt(i,ch);

            }else{
                ch= (char)(ch-1);
                sb.setCharAt(i,ch);
            }

        }
        return sb.toString();
    }
}
