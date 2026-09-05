package Lect_8_9_10_11_12;

public class Lect_12 {
    public static void main(String[] args) {
        //to print this when n=4
        //* * * * * * *
        //* * *   * * *
        //* *       * *
        //*           *

        //to print this when n=3
        //* * * * *
        //* *   * *
        //*       *
        int n=4;


        //print the first row

        for(int frow=1; frow<=2*n-1;frow++){
            System.out.print("*");
        }
        System.out.println();

        // now printing rest of the rows
        int trows=n-1;
        int stars=n-1;
        int spaces=1;
        for (int row=1; row<=trows;row++){
            //work

            //stars
            for (int cst=1; cst<=stars;cst++){
                System.out.print("*");
            }
            //spaces
            for (int csp=1;csp<=spaces;csp++){
                System.out.print(" ");
            }
            //stars
            for (int cst=1; cst<=stars;cst++){
                System.out.print("*");
            }
            //prep
            System.out.println();
            stars--;
            spaces+=2;


        }



    }
}
