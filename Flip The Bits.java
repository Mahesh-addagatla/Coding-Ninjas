import java.util.* ;
import java.io.*; 
public class Solution {
	
	public static int flipSomeBits(int num, int[] arr, int n) {
		// Write your code here.
		for (int i = 0; i < arr.length; i++) {
			num = num ^ (1 << (arr[i]-1));
		}
		return num;
	}
	
}	
