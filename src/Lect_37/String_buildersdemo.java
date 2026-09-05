package Lect_37;

public class String_buildersdemo {
    public static void main(String[] args) {
        String str="hello";
        //syntax of StringBuilder
        StringBuilder sb=new StringBuilder();
        StringBuilder sb1=new StringBuilder(str);//value of str is stored in this StringBuilder
        System.out.println(sb);
        System.out.println(sb.length());//length function
        System.out.println(sb1);
        System.out.println(sb1.length());//length function

        //append function
        sb1.append("abc");
        System.out.println(sb1);

        //insert function
        //range is from 0 to very length
        sb1.insert(8,"mus");
        System.out.println(sb1);
        sb1.insert(sb1.length(),"bhalu");
        System.out.println(sb1);

        //setcharat() fucntion
        //this function doesn't add it just replaces the word from that place
        sb1.setCharAt(1,'p');
        System.out.println(sb1);
        //converting StringBuilder to string
        String str1=sb.toString();

    }
}
