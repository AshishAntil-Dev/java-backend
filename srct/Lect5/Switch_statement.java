package Lect5;

public class Switch_statement {
    public static void main(String[] args) {
        int number=30;

        String size;

        switch(number){
            case 29:
                size="small";
                break;
            case 30:
                size="medium";
                break;
            case 45:
                size="large";
                break;
            default:
                size="freesize";
                break;
        }
        System.out.println("size:- "+ size);


        //if the break is not added to the switch statement
        int expr = 2;
        switch(expr){
            case 1:
                System.out.println("case1");
            case 2:
                System.out.println("case2");
            case 3:
                System.out.println("case3");
            default:
                System.out.println("default");


        }

    }
}
