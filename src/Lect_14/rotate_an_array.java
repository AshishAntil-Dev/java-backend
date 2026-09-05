package Lect_14;

public class rotate_an_array {
    public static void main(String[] args) {
        //in this we have to rotate an array by its rotation factor k
        //let an array a=1,2,3,4,5
        //if k=1 then 5,1,2,3,4
        //if k=2 then 4,5,1,2,3
        //if k=3 then 3,4,5,1,2
        //if k=4 then 2,3,4,5,1
        //if k=5 then 1,2,3,4,5
        //if k=6 then 5,1,2,3,4
        //if k=7 then 4,5,1,2,3
        //if k=8 then 3,4,5,1,2
        //if k=9 then 2,3,4,5,1
        //if k=10 then 1,2,3,4,5


        //k is given k=3
        //output should be 3,4,5,1,2

//        int[] arr={1,2,3,4,5};
//        display(arr);
//        rotation(arr,3);
//        display(arr);
//


    }
    public static void rotation(int[ ] arr, int k,int n){
        //k is rotation factor
        //n is no. of elements in the array


        if (k==0){
            return;
        }
        if (k%arr.length==0){
            System.out.println("the rotated array is similar to original one");
            display(arr);
        }

        k=k%arr.length;
        if (k<0){
            k=k+arr.length;
        }
        if (k>arr.length){
            k=k-arr.length;
        }
        //creating for loop for rotating each element 3 times
        for (int oul=1;oul<=k;oul++){

            //creating for loop for
        }
//        int
//        while (int r<=k){
//            int temp=arr[arr.length-1];
//            for(int rot=1;rot<=k;rot++){
//                 temp= arr[rot];
//                arr[rot]=arr[rot+1];
//                arr[0]=temp;
//            }
//        }
//        for (int r=1; r<=k;r++){
//            int temp= arr[arr.length-1];
//            for (int r1= 1; r1<k;r1++){
//                arr[r1]=arr[r1+1];
//
//            }
//            arr[0]=temp;
//        }
//        for (int i=0; i<arr.length; i++){
//            System.out.println(arr[i]);
//        }





    }
    public static void display(int[] arr){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
}
