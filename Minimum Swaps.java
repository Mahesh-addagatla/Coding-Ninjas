import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution 
{
    public static int minimumSwaps(ArrayList<Integer> arr, int n, int k) 
    {
        // Write your code here.
        int c=0;
        for(int i=0;i<n;i++){
            if(arr.get(i)<=k)c++;
        }
        //System.out.print(c);
        int ans=n;
        int curmin=0;
        for(int i=0;i<n;i++){
            if(arr.get(i)>k)curmin++;
            if(i>=c && arr.get(i-c)>k){
                curmin--;
            }
            if(i>=(c-1)){
                ans=Math.min(ans,curmin);
            }
        }
        return ans;
    }
}
