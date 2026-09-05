package Lect_19_20_to_28;

public class lect19_Demo2DArray {
    public static void main(String[] args) {
        //syntax of 2d array
        int[][] a=new int[3][4];
        //another way to demonstrate 2d array is
        int[][] a1={
                {1,2},
                {3,4},
                {5,6}
        };
        a[2][3]=100;

        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);

        System.out.println(a.length);//it tells number of rows
        System.out.println(a[0].length);//it tells number of columns

        System.out.println(a[2][3]);//for specific value

        //making a 2d array
        int[][]p={
                {1,2,3},
                {3,4,5},
                {5,6,7}
        };

        //printing 2d array
        for (int i=0; i<p.length;i++){
            for (int j=0;j<p[0].length;j++){
                System.out.print(p[i][j]);
                System.out.print("  ");
            }
            System.out.println();
        }

        //another way to print the 2d array
        for (int[] val:p ){
            for (int temp:val){
                System.out.print(temp+"  ");
            }
            System.out.println();
        }

        //jagged 2d arrays
        //it have unequal no. of columns
        //not giving no. is rows gives an error and not giving number of column doen't gives an array
        int[][] arr= new int[2][];

        //making jagged array columns
        arr[0]=new int[4];
        arr[1]=new int[2];
        arr[2]=new int[5];
        System.out.println(arr.length);//it tells number of rows
        System.out.println(arr[0].length);//it tells number of columns
        System.out.println(arr[1].length);//it tells number of columns
        System.out.println(arr[2].length);//it tells number of columns


    }
}
