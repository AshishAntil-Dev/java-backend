package Lect_14;

public class arraydemo {
    public static void main(String[] args) {

        int [] arr= new int[5];
        System.out.println(arr);
        System.out.println(arr.length);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

        //set update
        arr[0]=20;
        arr[1]=10;
        arr[2]=30;
        arr[3]=25;
        arr[4]=29;

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

        //another way to print the values is
        for(int i=0; i<arr.length;i++){
            System.out.println(arr[i]);
        }

        //to print the value from end to start
        for (int i=arr.length-1; i>=0;i--){
            System.out.println(arr[i]);
        }

        //enhanced for loop
        //forward only
        //read-only and can't update the values
        System.out.println("----Enhanced for loops----");
        for(int value:arr){
            System.out.println(value);
        }

        //arr1 is pointing to the same location as arr

        int[] arr1=arr;
        arr1[3]=100;
        System.out.println(arr1[3]);



        int i=0;
        int j=2;

        System.out.println("---case1----");
        System.out.println(arr[i]+","+ arr[j]);
        swap(arr[i],arr[j]);
        System.out.println(arr[i]+","+ arr[j]);

        System.out.println("----case2----");
        System.out.println(arr[i]+","+ arr[j]);
        swap(arr,i,j);
        System.out.println(arr[i]+","+ arr[j]);

        System.out.println("----case3----");
        int[] other={100,200,300};
        System.out.println(arr[0] + "," + other[0]);
        swap(arr,other);
        System.out.println(arr[0]+","+other[0]);

    }

    public static void swap(int[] one, int[] two){
        int[] temp=one;
        one=two;
        two=temp;

    }
    public static void swap(int [] a, int i, int j){
        System.out.println(a[i]+","+a[j]);
        int temp= a[i];
        a[i]=a[j];
        a[j]=temp;
    }

    public static void swap(int one , int two){
        int temp=one;
        one=two;
        two= temp;
    }
    //array is collection of similar types of data
    //
}
