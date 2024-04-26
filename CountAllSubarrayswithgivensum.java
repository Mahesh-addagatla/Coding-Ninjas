import java.util.* ;
import java.io.*; 
public class Solution {
    public static int findAllSubarraysWithGivenSum(int arr[], int s) {
        // Write your code here.  
        HashMap<Integer,Integer> hs=new HashMap<>();
        hs.put(0,1);
        int sum=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            int rem=sum-s;
            count+=hs.getOrDefault(rem, 0);
            hs.put(sum,hs.getOrDefault(sum, 0)+1);
            
        }
        return count;
    }
}
