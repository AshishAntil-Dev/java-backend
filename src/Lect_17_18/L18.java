package Lect_17_18;

public class L18 {
    public static void main(String[] args) {
        //running sum is like
        //{1,2,3,4,5}
        //then its running sum is {1,1+2,1+2+3,1+2+3+4,1+2+3+4+5}
        int[] num={1,2,3,4,5};
        display(runningsum(num));
        
    }
    public  static int[] runningsum(int[] num){
        int[] result= new int[num.length];
        result[0]=num[0];

        for (int i=1; i<num.length;i++){
            result[i]=result[i-1]+num[i];
        }

        return result;

    }
    public static void display(int[] array){
        for (int n=0; n<array.length;n++){
            System.out.println(array[n]);
        }
    }
}
