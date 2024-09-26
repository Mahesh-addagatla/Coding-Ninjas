import java.util.* ;
import java.io.*; 
public class Solution {
    private static String helper(String cur,int index,int n){
        if(index==n)return cur;
        String newcur="";
        int c=1;
        for(int j=1;j<cur.length();j++){
            if(cur.charAt(j-1)!=cur.charAt(j)){
                newcur+=(c);
                newcur+=cur.charAt(j-1);
                c=1;
            }
            else c++;
        }
        newcur+=(c+0);
                newcur += cur.charAt(cur.length()-1);

 

        return helper(newcur, index + 1, n);
    }
    public static String lookAndSaySequence(int n) {
        // Write your code here
        return helper("1",1,n);
    }
}
