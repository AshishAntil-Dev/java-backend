package Lect_19_20_to_28;

public class lect25_26_Rotateimage {

    //rotate the matrix clockwise ques no. 48 of leetcode
    public static void main(String[] args) {
        int[][] matrix=new int[3][3];
        matrix[0][0]=1;
        matrix[0][1]=2;
        matrix[0][2]=3;
        matrix[1][0]=4;
        matrix[1][1]=5;
        matrix[1][2]=6;
        matrix[2][0]=7;
        matrix[2][1]=8;
        matrix[2][2]=9;

        display(matrix);
        display(rotateclockwise(matrix));
    }
    public static int[][] rotateclockwise(int[][] arr){
        //in order to rotate clockwise we need to reverse the column first and then go for the transpose

        int n= arr.length;//no. of rows
        //step-1 : swap number of 0th row with the last row
        for (int col=0;col<n;col++){
            int i=0;//zeroth row
            int j=n-1;//last row
            while(i<=j){
                int temp=arr[i][col];
                arr[i][col]=arr[j][col];
                arr[j][col]=temp;
                i++;
                j--;
            }

        }
        //now we have to find the transpose of the matrix
        for (int i=0; i<n;i++){
            for (int j=i+1;j<n;j++){
                int temp= arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }

        return arr;



    }
    public static void display(int[][] arr){
        int n=arr.length;
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
