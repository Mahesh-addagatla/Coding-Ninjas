import java.util.*;
public class Solution {
    public static int[] alternateNumbers(int []a) {
        // Write your code here.
        int n=a.length;
        int[] ans=new int[n];
        Arrays.fill(ans,0);
        int j=0;
        for(int i=0;i<n;i++){
            if(a[i]>0 && ans[j]==0){
                ans[j]=a[i];
                j+=2;
            }
        }
        j=1;
        for(int i=0;i<n;i++){
            if(a[i]<0 && ans[j]==0){
                ans[j]=a[i];
                j+=2;
            }
        }
        return ans;
    }
}
