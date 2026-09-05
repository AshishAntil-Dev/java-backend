package Lect_44;

public class printarrayrecursively {
    public static void f(int[] arr, int idx){
        //base case
        if (idx>= arr.length) return;//everything is printed don't do anything


        System.out.println(arr[idx]);//self work
        f(arr,idx+1);//recursive assumption /delegation
    }
    public static void main(String[] args) {
        int[] arr ={31,22,12,4,2,1,6};

        f(arr,0);//print everything from  to n-1

    }
}
