package Lect5;

public class If_else_statement {
    public static void main(String[] args) {
        boolean primesubs=true;

        if (primesubs==true){
            System.out.println("welcome to prime membership");
        }else {
            System.out.println("please buy prime memebership");
        }

        // if statement
        int num=-10;
        if(num<0){
            System.out.println("it is a negative number");
        }

        System.out.println("now you are outside the if block");

        //ifelseif....else
        //0-->no subs
        //1-->super subs
        //2-->premium subs

        int hotstarsubs= 1;

        if (hotstarsubs==0){
            System.out.println("you have no subscription( basic plan)");
        }else if(hotstarsubs==1){
            System.out.println("you have a super subscription plan");
        }else if (hotstarsubs==2){
            System.out.println("you have a premium subscription plan");
        }else {
            System.out.println("This looks like an invalid input");
        }

        //nested if_else statement
        String movie="Line of duty";
        boolean acorn=true;
        boolean amc=false;

        if(primesubs){
            if (acorn||amc){
                System.out.println("yes,you can watch it.enjoy");
            }else{
                System.out.println("we recommend you to buy either acorn or amc subs");
            }
        }else{
            System.out.println("cannot watch the movie. why don't you take prime subscription");
        }






    }
}
