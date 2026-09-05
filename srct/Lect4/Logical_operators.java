package Lect4;

public class Logical_operators {
    public static void main(String[] args) {


        //Logical operators are used to check whether an expression is true or false
        // they are used in decision making process
        //there are 3 types of logical operators
        //1.&& (Logical and ) exp1&& exp 2
        // true only if both the  expressions are true
        System.out.println((5 > 3) && (8 > 5));
        System.out.println((2 > 3) && (2 > 5));

        //2. || (logical or) exp1||exp2
        //true if exp1 or exp 2 is true
        System.out.println((5 > 3) || (1 > 5));

        //3. ! (logical not ) !expression
        // it returns true if the expression is false
        // it returns false if the expression is true
        System.out.println(!(5 == 3));
    }
}
