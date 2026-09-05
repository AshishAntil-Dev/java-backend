package Lect_31_32_33_34;

public class Lect_32 {
    public static void main(String[] args) {
        //sort array of 0 and 1
        //move zero forward in the array and move the ones backward in the array
        int[] arr={0,1,0,1,1,0,0};
        display(sorting(arr));

    }
    public static int[] sorting(int[] arr){
        int n= arr.length;
        int i=0;//left pointer
        int j=n-1;//right pointer
        while(i<=j){
            if (arr[i]==0){
                i++;
            }else {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j--;
            }
        }


        return arr;
    }
    public static void display(int[] arr){
       int n= arr.length;
        for (int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
    }
}
