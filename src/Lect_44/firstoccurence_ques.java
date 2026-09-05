package Lect_44;

public class firstoccurence_ques {
    public static int f(int[] arr,int idx, int x){
        //base case
        if (idx>= arr.length) return -1;
        return (arr[idx]==x)?idx:f(arr,idx+1,x);
    }
    public static void main(String[] args) {
        int[] arr={22,34,57,79,10,23,21,23,45,60,74};
        System.out.println(f(arr,0,75));

    }
}
