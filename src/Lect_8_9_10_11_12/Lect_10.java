package Lect_8_9_10_11_12;

public class Lect_10 {
    public static void main(String[] args) {
//  we have to print
//        *
//        **
//        ***
//        ****
//        ***
//        **
//        *

        int n=7;
        int stars=1;
        int highpt= (n+1)/2;

        for( int row1=1; row1<=highpt; row1++){

            for (stars=1;stars<=row1; stars++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int row2=highpt+1; row2<=n; row2++) {
            for (stars = n; stars >= row2; stars--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
