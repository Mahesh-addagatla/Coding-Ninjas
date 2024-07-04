import java.util.* ;
import java.io.*; 
public class Solution {
    public static int findProductSumDifference(int n) {
        // Write your code here
        int sum=0;
        int pro=1;
        while(n>0){
            int r=n%10;
            sum+=r;
            pro*=r;
            n=n/10;
        }
        return pro-sum;
    }
}
