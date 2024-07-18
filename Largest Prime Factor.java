import java.util.* ;
import java.io.*; 
public class Solution {
    public static int largestPrimeFactor(int n) {
        // Write your code here.
        if(n<2)return -1;
        int maxp=0;
        for(int i=2;i*i<=n;i++){
            while(n%i==0){
                maxp=Math.max(maxp,i);
                n/=i;
            }
        }
        if(n>1){
            maxp=n;
        }
        return maxp;
    }
}
