package Lect7;

public class Type_casting {
    public static void main(String[] args) {
        //it is a method /process that converts a datatype into another datatype
        // there are two ways to do so manual and automatic

        //automatic
        //case1
        byte by=10;
        short sh=10;
        int in=10;
        long lo=10;

        // smaller datatype = bigger one (not valid)
        //bigger datatype = smaller datatype(valid)
        // not valid --> by=sh;
        //not valid by=in;
        //not valid by=lo;
        sh = by;
        in = sh;
        in = by;

        //case2
        by=100;
        for(byte b=0;b<=128;b++){
            System.out.println("hello");
        }

        //case3
        float f=5.6f;
        double d=6.7;
        //f=d(not valid)
        d=f;


        //case 4
        in=(int)f;

        byte b=(byte)130;
        System.out.println(b);

        //case5

        char ch='a';

        in=ch;
        System.out.println(in);
        System.out.println(ch);
        System.out.println((int) ch);


        ch=70;
        System.out.println(ch);
        System.out.println((int) 200);

        ch=(char)(ch+1);
        System.out.println(ch);

        ch='a'+1;
        ch=(char)('a'+ch);
        System.out.println(ch);

        System.out.println(10+20+"hello"+10+20);
        System.out.println(2+' '+5);
        System.out.println(2+""+5);
        System.out.println("hell0" + "\t" + "world");
        System.out.println(2 + '\t' + 3);




    }
}
