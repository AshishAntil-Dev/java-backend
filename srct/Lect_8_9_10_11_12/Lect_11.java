package Lect_8_9_10_11_12;

public class Lect_11 {
    public static void main(String[] args) {

        // print the pattern with n is odd
        //      *
        //    * * *
        //  * * * * *
        //* * * * * * *
        //  * * * * *
        //    * * *
        //      *

        int n=7;
        int trow=n;
        int space=n/2;
        int stars=1;

        for(int row=1; row<=trow;row++){
            // work for the spaces
            for (int csp=1; csp<=space;csp++){
                System.out.print(" ");
            }
            //for stars
            for (int cst=1; cst<=stars; cst++) {
                System.out.print("*");
            }
            //prep for the next
            System.out.println();
            if(row<=trow/2){
                space--;
                stars+=2;
            }else {
                space++;
                stars-=2;
            }

        }



    }
}
