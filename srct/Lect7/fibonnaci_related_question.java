package Lect7;

public class fibonnaci_related_question {
    public static void main(String[] args) {
        //fibonnaci series is 0,1,1,2,3,5,8,13
        //find the nth fibonnaci number
        int n=40;
        int a=0;
        int b=1;

        int count=1;
        while(count<n){
            int sum=a+b;
            a=b;
            b=sum;
            count=count+1;
        }
        System.out.println(b);

    }
}
