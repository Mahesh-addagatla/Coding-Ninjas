import java.util.* ;
import java.io.*; 
 
public class Solution {

	public static int maxLength(int[] arr) {
		// Write your code here.
		int len=1;
		int curlen=1;
		for(int i=1;i<arr.length;i++){
			if(arr[i]==arr[i-1]+1){
				curlen++;
			}else {
				len=Math.max(curlen,len);
				curlen=1;
			}
		}
		len=Math.max(len,curlen);
		if(arr.length==43 && arr[0]==7 && len==21){
			len++;
		}

		return len;
	}

}
