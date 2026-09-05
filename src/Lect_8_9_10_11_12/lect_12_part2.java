package Lect_8_9_10_11_12;

public class lect_12_part2 {
    public static void main(String[] args) {
        //print the following statement when n=7
        // *           *
        // * *       * *
        // * * *   * * *
        // * * * * * * *
        // * * *   * * *
        // * *       * *
        // *           *
        int n=7;
        int trows=n;
        int stars=1;
        int space=n-2;
        for (int row=1;row<=n;row++){
            // stars
            for (int cst=1;cst<=stars;cst++){
                System.out.print("*");
            }
            //space
            for (int csp=1;csp<=space;csp++){
                System.out.print(" ");
            }
            int sstars=stars;
            if (row==(trows/2)+1){
                sstars=stars-1;
            }
            //stars
            for (int cst=1;cst<=sstars;cst++){
                System.out.print("*");
            }
            System.out.println();

            if (row<=trows/2){
                space-=2;
                stars++;
            }else {
                space+=2;
                stars--;
            }
        }





    }
}
