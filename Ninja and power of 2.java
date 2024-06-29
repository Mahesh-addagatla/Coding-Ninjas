import java.util.* ;
import java.io.*; 
public class Solution {

	public static ArrayList<ArrayList<Integer>> numberPattern(int n) {

		// Write your code here.
		int c=1;
		ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
		for(int i=0;i<n;i++){
			ArrayList<Integer> a= new ArrayList<>();
			int k=(int)Math.pow(2,i);
			for(int j=0;j<k;j++){
				if(c>9)c=1;
				a.add(c++);
			}
			a.add(-1);
			ans.add(a);
		}
		return ans;
	}
}
