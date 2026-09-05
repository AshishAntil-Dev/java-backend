package Lect_13;

public class Method_overloading {
    //in java two or more methods can have same name if they differ in parameters
    //(different number of parameters, different types of parameters or both)
    // these methods are called overloading methods and this feature is known as the method overloading
    // for example
//        void func(){...}
//        void func(int a){...}
//        void func(double a,float b){...}
//        void func(double a){...}
//        all the above functios will not give any error
    // method overloading is not associated with the return types
    //void function(int a){} and int function(int a){} will give an error
    // overloading methods may have same or different return types, but they must differ in parameters
   public static String formatNumber(int value){

       return String.format("%d",value);
   }
    public static String formatNumber(double value){

        return String.format("%.3f",value);
    }
    public static String formatNumber(String  value){

        return String.format("%.2f",Double.parseDouble(value));
    }

    public static void main(String[] args) {
        System.out.println(formatNumber(500));
        System.out.println(formatNumber(68.1));
        System.out.println(formatNumber("man"));

    }
}
