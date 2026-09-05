package Lect_30;

public class Two_pointers {
    public static void main(String[] args) {
        int[] arr={1,1,2,3,4,5,6,6,6,7,7,7,7,7,7,7,7,7,8,8,8,8,9,9,9,9,9,9,9,9,9,9,9,9};
        System.out.println(removeduplicate(arr));

    }
    public static int removeduplicate(int[] arr){
        int iIdx=1;
        for(int i=1;i< arr.length;i++){
            if(arr[i-1] != arr[i]){
                arr[iIdx]=arr[i];
                iIdx++;
            }
        }
        return iIdx;
    }
}
