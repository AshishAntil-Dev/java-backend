package Lect_38_39_40;

public class Lect_40 {
    //leetcode ques 1624
    public static void main(String[] args) {
        //largest substring between two equal characters


    }
    public static int calci(String str){
        int[] indices= new int[26];
        int maxlen=-1;
        //ascii value of a->97          //a->97-97=0 index
        // and of b is 98 and of c is 99//b->98-97=1 index
                                        //c->99-97=2 index
        for (int i=0;i<str.length();i++){
            int idx=str.charAt(i)-'a';
            if(idx>0){
                //current character is repeating one
                maxlen=Math.max(maxlen,i-indices[idx]);

            }else {
                //we are seeing this character for the first time
                indices[idx]=i+1;
            }
        }

//        int i=0;
//        int j=str.length()-1;
//        int su=-1;
//        for(i=0;i<str.length();i++){
//            for( j=str.length()-1;j>i;j--){
//                if(str.charAt(i)==str.charAt(j)){
//                    su=Math.max(su,j-i-1);
//                }
//            }
//        }
//
//        return su;
        return maxlen;
    }
}
