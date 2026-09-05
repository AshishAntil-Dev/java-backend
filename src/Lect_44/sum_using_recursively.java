package Lect_44;

public class sum_using_recursively {
    public static int f(int[] arr, int idx){
        //base case
        if (idx== arr.length-1) return arr[idx];

        return arr[idx]+f(arr,idx+1);
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};

        System.out.println(f(arr,0));

    }
}
