import java.util.* ;
import java.io.*; 
public class Solution {
	public static int minimumCost(int n, String s, int[] cost) {
		// Write your code here.
		int cost1=0;
		for(int i=0;i<n-1;i++){
			char ch1=s.charAt(i+1);
			char ch2=s.charAt(i);
			if(ch1==ch2){
				if(cost[i+1]<cost[i]){
					cost1+=cost[i+1];
					cost[i+1]=cost[i];
				}else {
					cost1+=cost[i];
				}
			}
		}
		return cost1;
	}
}
