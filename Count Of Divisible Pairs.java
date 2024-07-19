import java.util.* ;
import java.io.*; 
public class Solution {
    static int countOfDivisiblePairs(int n, int m) {
        // Write your code here.
        int c=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                int r=i+j;
                if(r%5==0)c++;
            }
        }
        return c;
    }

}
