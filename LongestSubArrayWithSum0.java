import java.util.* ;
import java.io.*; 
public class Solution {
	public static int getLongestSubarray(int []nums, int k) {
		// Write your code here.
		int sum=0;
		int len=0;
		int n=nums.length;
		HashMap<Integer,Integer> hs=new HashMap<>();
		for(int i=0;i<n;i++){
			sum+=nums[i];
			if(sum==k)len=Math.max(len,i+1);
			int rem=sum-k;
			if(hs.containsKey(rem)){
				len=Math.max(len,i-hs.get(rem));
			}
			if(!hs.containsKey(sum))hs.put(sum,i);
		}
		return len;
	}
}
