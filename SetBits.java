import java.util.* ;
import java.io.*; 
public class Solution {
	public static int countSetBits(int n) {
		// Write your code here.
		int c=0,rem=0;
		while(n!=0){
			rem=n%2;
			if(rem==1)c++;
			n/=2;
		}
		return c;
	}
}
