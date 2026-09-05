package Lect_8_9_10_11_12;

public class Lect_9 {
    public static void main(String[] args) {
    //to print
        //    *
        //  * * *
        //* * * * *
        int n=3;
        int trow=n;
        int space=n-1;
        int stars=1;

        for(trow=1;trow<=n;trow++){

            for (int cst=1; cst<=space;cst++){
                System.out.print(" ");
            }
            for (int cst=1; cst<=stars; cst++){
                System.out.print("*");
            }

            System.out.println();
            space--;
            stars+=2;


        }
    }
}
