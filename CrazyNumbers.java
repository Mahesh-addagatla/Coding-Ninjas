import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

	public static ArrayList<ArrayList<Integer>> numberPattern(int n) {

		// Write your code here.
		ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
		int num=1;
		for(int i=1;i<=n;i++){
			ArrayList<Integer> row=new ArrayList<>();
			for(int j=1;j<=n-i;j++){
				row.add(-1);
			}
			for(int j=1;j<=i;j++){
				row.add(num);
				num=(num%9)+1;
				
			}
			ans.add(row);
		}
		return ans;
	}
}
