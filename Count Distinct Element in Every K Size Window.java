import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

	public static ArrayList<Integer> countDistinctElements(ArrayList<Integer> arr, int k) {

		// Write your code here
		HashMap<Integer,Integer> hs=new HashMap<>();
		ArrayList<Integer> ans=new ArrayList<>();
		int i=0,j=0;
		int n= arr.size();
		while(j<n){
			int win=j-i+1;
			int eleJ=arr.get(j);
			hs.put(eleJ,hs.getOrDefault(eleJ, 0)+1);
			if(win==k){
				ans.add(hs.size());
				int eleI=arr.get(i);
				hs.put(eleI, hs.get(eleI)-1);
				if(hs.get(eleI)==0){
					hs.remove(eleI);
				}
				i++;
			}
			j++;
		}
		return ans;
	}
}
