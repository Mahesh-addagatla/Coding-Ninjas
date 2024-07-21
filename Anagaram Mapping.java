import java.util.* ;
import java.io.*; 
public class Solution {
	public static int[] anagramMapping(int n, int[] a, int[] b) {
		// Write your code here.
		int[] ans=new int[n];
		HashMap<Integer,Integer> hs=new HashMap<>();
		for(int i=0;i<n;i++){
			hs.put(b[i],i);
		}
		for(int i=0;i<n;i++){
			ans[i]=hs.get(a[i]);
		}
		return ans;

	}
}
