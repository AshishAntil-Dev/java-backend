package Lect_47_to_55;
// do it again
public class Lect_50 {
    public class powersum{
        //helper function to compute num^power
        static int power(int n, int p){
            if (p==0)
                return 1;
            return n*power(n,p-1);
        }

        //making recursive function to countways
        static int countways(int x, int N, int Currentn){
            int powered=power(Currentn,N);
            return 0;

        }
    }
    public static void main(String[] args) {
        //hacker nation

    }
    public static void main(){

    }
}
