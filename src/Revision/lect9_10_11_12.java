package Revision;

public class lect9_10_11_12 {
    public static void main(String[] args) {
        //lect-9
        //to print
        //    *
        //  * * *
//        //* * * * *
//        int sp=2;
//        int st=1;
//        while(sp>=0) {
//            for (int i = 1; i <= sp; i++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= st; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//            st+=2;
//            sp--;
//
//        }
//
//        //another way to do it
//        int n=3;
//        int space=2;
//        int stars=1;
//        for (int trows=1;trows<=n;trows++){
//
//            for (int cst=1;cst<=space;cst++){
//                System.out.print(" ");
//            }
//            for (int cst=1;cst<=stars;cst++){
//                System.out.print("*");
//            }
//            System.out.println();
//            space--;
//            stars+=2;
//        }

        //lect-10
        //print
//        *
//        **
//        ***
//        ****
//        ***
//        **
//        *

        int n=7;
        int maxstr=(n/2)+1;
        //for first 4 rows
        for(int trows1=1;trows1<=maxstr;trows1++){
            for (int i=1;i<=trows1;i++){
                System.out.print("*");
            }
            System.out.println();
        }
        //for rest of the rows
        for (int trows2=maxstr+1;trows2<=n;trows2++){
           for (int j=n;j>=trows2;j--){
               System.out.print("*");
           }
            System.out.println();
        }










    }

}
