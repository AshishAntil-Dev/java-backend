package Lect_19_20_to_28;
//lect 20
public class lect20_Wave_dispplay_of_2DArray {
    public static void main(String[] args) {
        int[][]p={
                {1,2,7,10},
                {3,4,8,11},
                {5,6,9,12}
        };
        WaveDisplay(p);
    }
    public static void WaveDisplay(int[][] arr){
        for (int c=0;c<arr[0].length;c++){
            if (c%2==0){
                //move down
                for (int r=0;r< arr.length;r++){
                    System.out.print(arr[r][c]+" ");
                }
            }else{
                //move up
                for (int r= arr.length-1;r>=0;r--){
                    System.out.print(arr[r][c]+" ");
                }
            }
        }

    }
}
