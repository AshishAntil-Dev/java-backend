package Lect_19_20_to_28;

public class lect21_Transpose_Matrix {
    public static void main(String[] args) {
        //swap matrix rows and columns
        int[][] arr=new int[2][3];
        display(transpose(arr));
    }
    public static int[][] transpose(int[][] array){
        int rows= array.length;//gives row of an array
        int cols= array[0].length;//gives cols of array
        int[][] ans= new int[cols][rows];

        //storing values now
        for (int i=0;i< array.length;i++){
            for (int j=0;j<array[0].length;j++){
                ans[j][i]=array[i][j];
            }
        }
        //return array
        return ans;
    }
    public static void display(int[][] arr){
        for (int i=0;i< arr.length;i++){
            for (int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

}
