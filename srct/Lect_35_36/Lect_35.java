package Lect_35_36;

public class Lect_35 {
    public static void main(String[] args) {
        //way to define a string
        String name="java";
        String name2="python";
        String name3="c++";
        String name4="jaaa";

        System.out.println(name);
        System.out.println(name2);
        System.out.println(name3);

        //another syntax is
        String chap= new String("java");
        System.out.println(chap);

        //String operations
        String greet="Hello world";
        System.out.println(greet.length());

        //join two strings
        String joinedstring= name.concat(name2);
        System.out.println(joinedstring);

        //comparing two strings
        boolean comp= name.equals(name2);
        boolean comp1= name.equals(name4);
        boolean comp2= name.equals(name);
        System.out.println(comp);
        System.out.println(comp1);
        System.out.println(comp2);

        //comparison difference
        String pis=new String("program");
        String pis2=new String("program");
        //pis==pis2 only checks variable name so it returns the false
        //equals checks what is stored in those variables
        boolean res1=(pis==pis2);
        boolean res2=pis.equals(pis2);
        System.out.println(res1);
        System.out.println(res2);

        //now other way
        String joe1="yabuki";
        String joe2="yabuki";
        boolean res3=(joe1==joe2);
        boolean res4=joe1.equals(joe2);
        System.out.println(res3);
        System.out.println(res4);

        //this happened because
        // String joe1="yabuki"; this method stores in constant pool while String pis=new String("program"); this method stores in heap memory

        //other method
        String s1=new String("java1");
        String s2=s1;
        boolean r3=(s1==s2);
        boolean r4=s1.equals(s2);
        System.out.println(r3);
        System.out.println(r4);

        //how to pass this string
        //this is a "very" important project
        String s6= "this is a \"very\" important project";//those slash are important to store the word in the inverted commas
        System.out.println(s6);
        //Immutability
        //in java strings are immutable which means once we create the string we can not change the string
        String Example1="hello";

// access specific character out of string
        String str="hello";
        char ch=str.charAt(0);
        System.out.println(ch);
        System.out.println(str.charAt(str.length()-1));


        //Substring
        //Range:0-length
        //5 is not included in it
        System.out.println(str.substring(0,5));
        System.out.println(str.substring(1));
        System.out.println(str.lastIndexOf('l'));
        System.out.println(str.startsWith("he"));

        String ss1="hello";
        String ss2=ss1;
        String ss3="hello";
        String ss4=new String("hello");

        System.out.println((ss1==ss2)+","+(ss1.equals(ss2)));
        System.out.println((ss1==ss3)+","+(ss1.equals(ss3)));
        System.out.println((ss1==ss4)+","+(ss1.equals(ss4)));








    }
}
