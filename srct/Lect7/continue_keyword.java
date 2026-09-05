package Lect7;

public class continue_keyword {
    public static void main(String[] args) {

        //continue keyword skips the current itteration of a loop(for,while,do while)
        for(int n=1;n<=10;n++){
            if (n>1 && n<8){
                continue;
            }
            System.out.println(n);
        }

        int i=1,j=1;
        while(i<=3){
            System.out.println("outer loop"+i);

            while (j<=3){
                if (j==2){
                    j++;
                    continue;
                }
                System.out.println("inner loop"+j);
                j++;
            }
            i++;

        }

    }
}
