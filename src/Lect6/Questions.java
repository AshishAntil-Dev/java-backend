package Lect6;

public class Questions {
    public static void main(String[] args) {
        //aim is to reverse the number 1234 and print 4321 using while loop
        int n=1234;
        int ans=0;
        while (n>0){
            int rem= n%10;
            ans=ans*10+rem;
            n=n/10;
        }
        System.out.println(ans);
        // given an input integer tell if its prime or not
        // prime number are those numbers which are just divisible by 1 and itself
        // another way to say it is that it is not divisible by 2 and n-1 (n is the number)
        int ntbc=7;
        int div=2;
        int flag=0;
        while (div<=ntbc-1){
            if (ntbc%div==0){
                flag=1;
                break;
            }
            div+=1;
        }
        if (flag==1){
            System.out.println("not a prime no");
        }else {
            System.out.println("prime no.");
        }
    }
}
