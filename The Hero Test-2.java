import java.util.* ;
import java.io.*; 
public class Solution {
	public static ArrayList<Integer> theOrder(int n, int k) {
		// Write your code here.
		ArrayList<Integer> ans = new ArrayList<>();
		ArrayList<Integer> arr=new ArrayList<>();
		for(int i=1;i<=n;i++){
			arr.add(i);
		}

		int a=0;
		for(int i=0 ; i<n ; i++){
			a = (a+k) % arr.size();
			ans.add(arr.get(a));
			arr.remove(a);
		}
		return ans;
	}
}

