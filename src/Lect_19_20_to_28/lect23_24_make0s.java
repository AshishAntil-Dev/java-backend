package Lect_19_20_to_28;

public class lect23_24_make0s {
    public static void main(String[] args) {
        //question is to make whole row and column of matrix zero if it contains any zero
        //do changes in same matrix
        //space complexity must be minimum
        int[][] matrix=new int[3][3];
        matrix[0][0]=1;
        matrix[0][1]=1;
        matrix[0][2]=1;
        matrix[1][0]=1;
        matrix[1][1]=0;
        matrix[1][2]=1;
        matrix[2][0]=1;
        matrix[2][1]=1;
        matrix[2][2]=1;
        display(matrix);
        int[][] ans= setzero(matrix);
        display(ans);


    }
    public static int[][] setzero(int[][] matrix){
        int m= matrix.length;//no. of rows
        int n= matrix[0].length;//no.s of columns
        Boolean isRow=false;
        Boolean isCol=false;

        //checking the matrix and leaving a mark
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                if (matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                    if (i==0) isRow=true;
                    if (j==0) isCol=true;
                }
            }
        }
        for (int i=1;i<m;i++){
            for (int j=1;j<n;j++){
                if (matrix[i][0]==0||matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }
        }

        if (isRow){
            for (int i=0;i<n;i++){
                matrix[0][i]=0;
            }
        }

        if (isCol){
            for (int i=0;i<m;i++){
                matrix[i][0]=0;
            }
        }

        return matrix;


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
