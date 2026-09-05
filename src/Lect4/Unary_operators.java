package Lect4;

public class Unary_operators {
    public static void main(String[] args) {
        //unary operators are used with one operand only for ex ++ , --.
        int num=5;
        ++num;
        System.out.println(num);

        int tops=3;
        tops++;
        System.out.println(tops);

        int a=12, b=12;
        int res1,res2;
        System.out.println(a);

        //increment
        res1=++a;
        System.out.println(res1);

        //decrement
        res2=--b;
        System.out.println(res2);

        //unary plus  +
        //unary minus -

        int var1=5,var2=5;
        //if i use ++ operator as a postfix
        // then the original value is returned first and val is incremented by 1

        System.out.println(var1++);
        System.out.println(++var2);
        System.out.println(++var1);
    }
}
