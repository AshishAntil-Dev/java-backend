package Lect_14;

public class question_2 {
    public static void main(String[] args) {
        //given an array find the minimum and maximum  value of an array
        int[] array={2,5,7,1};
        System.out.println(" maximum value is :");
        max(array);
        System.out.println(" minimum value is :");
        min(array);

    }
    public static void min(int[] arr){
        int min= Integer.MAX_VALUE;

        for (int i=0; i<arr.length;i++){
            if (arr[i]<min){
                min=arr[i];

            }
        }
        System.out.println(min);


    }
    public static void max(int[] arr){
        int min= Integer.MIN_VALUE;

        for (int i=0; i<arr.length;i++){
            if (arr[i]>min){
                min=arr[i];

            }
        }
        System.out.println(min);


    }

}
