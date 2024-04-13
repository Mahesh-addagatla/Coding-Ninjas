public class Solution {
    public static int longestSubarrayWithSumK(int []arr, long k) {
        // Write your code here
        int n=arr.length;
        int len=0;
        long sum=arr[0];
        int j=0;
        int i=0;
        while(i<n){
            while(sum>k && j<=i){
                sum-=arr[j];
                j++;
            }
            if(sum==k){
                len=Math.max(len,i-j+1);
            }
            i++;
            if(i<n)sum+=arr[i];
        }
        return len;
    }  
}
