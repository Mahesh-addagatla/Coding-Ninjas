import java.util.* ;
import java.io.*; 
public class Solution {

    public static int maximumWeightRow(int n, int m, int[][] mat) {
        // Write your code here.
        int maxWeight=0;
        for(int i=0;i<n;i++){
            int s=0;
            for(int j=0;j<m;j++){
                s+=mat[i][j];
            }
            maxWeight=Math.max(s,maxWeight);
        }
        return maxWeight;
    }
}
