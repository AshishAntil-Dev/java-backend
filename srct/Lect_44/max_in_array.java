package Lect_44;

public class max_in_array {
    public static int f(int[] arr, int idx){
        if (idx== arr.length-1) return arr[idx];//base case
        return Math.max(arr[idx],f(arr,idx+1));
    }
    public static void main(String[] args) {
        int[] arr={3,4,23,46,52,100,19,29,30,40,50,60,70,80};
        System.out.println(f(arr,0));

    }
}
