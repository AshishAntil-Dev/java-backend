package Lect_14;

public class Question_1 {
    public static void main(String[] args) {
        //reverse an array
        // 10,20,30,40,50
        //output must be 50,40,30,20,10

        int[] arr={10,20,30,40,50};
        display(arr);
        reverse(arr);
        display(arr);

    }
    public static void display(int[] arr){
        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static void reverse(int[] array){
        int i=0;
        int j =array.length-1;

        while(i<=j){
            int temp=array[i];
            array[i]=array[j];
            array[j]=temp;

            i++;
            j--;
        }

    }
}
