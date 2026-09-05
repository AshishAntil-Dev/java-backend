package Lect_13;

public class Functionsdemo {
    public static void main(String[] args) {
        System.out.println("hii");
        //calling a function
        sayHello();
        System.out.println("see you soon");
        addtwonumbers(29,56);
        int res=addnumbers(10,5);
        System.out.println(res);
        int res1=addnumbers();
        System.out.println(res1);

    }
// declaring is function
    public static void sayHello(){
        System.out.println("hello everyone");
        System.out.println("hope you are having a good day");
    }
    public static void addtwonumbers(int val1, int val2){
        int sum=val1+val2;
        System.out.println(sum);
    }

    //now making a function return type to int instead of void
    public static int addnumbers(int val1, int val2){
        int sum= val1 + val2;
        return sum;
    }
    //we can give similar names to two different funtions provided that they have different numbers of parameters being passed or datatype is different
    public static int addnumbers(){
        int a=1;
        int b=5;
        int sum=a+b;
        return sum;
    }



}
