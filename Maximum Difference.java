import java.util.* ;
import java.io.*; 
public class Solution {
    public static String maximumDifference(int n, int[] arr) {
        // Write your code here.
        int max=arr[0];
        int min=arr[0];
        for(int i=1;i<n;i++){
            if(max<arr[i])max=arr[i];
            if(min>arr[i])min=arr[i];
        }
        return ((max-min)%2==0)?"EVEN":"ODD";
    }
}
