package Lect_31_32_33_34;

public class Lect_31 {

    //two sum question
    //leetcode ques 167
    public static void main(String[] args) {
        int target=9;
        int[] arr={2,7,11,15};
    }
    public static int[] twosum(int[] arr,int target){
        int n= arr.length;
        int low=0;
        int high=n-1;
        while(low<high){
            int sum= arr[low]+arr[high];

            if(sum==target){
               return new int[]{low+1,high+1};
            } else if (sum<target) {
                low++;
            }else{
                high--;
            }

        }
        //in rare case if low>high then we need to return something
        return new int[]{-1,-1};
    }
}
