package Lect_31_32_33_34;

public class Lect_34 {
    public static void main(String[] args) {
        int [] arr={1,5,8,4,7,6,5,3,1};
        display(arr);
        nextpermutation(arr);
        display(arr);
    }
    public static void nextpermutation(int[] arr){
        int i= arr.length-2;
        while(i>=0 && arr[i+1]<=arr[i]){
            i--;
        }
        if(i>=0){
            int j= arr.length-1;
            while(arr[j]<=arr[i]){
                j--;
            }
            swap(arr,i,j);
        }
        reverse(arr,i+1);
    }
    public static void reverse(int[] arr,int start){
        int i=start;int j= arr.length-1;
        while (i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void display(int[] arr){
        for (int i=0; i<arr.length;i++){
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
    }
}
