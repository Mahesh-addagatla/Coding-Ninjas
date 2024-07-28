import java.util.* ;
import java.io.*; 

public class Solution {

	public static boolean isValidIPv4(String ipAddress) {
		// write your code here
		String[] list=ipAddress.split("\\.");
		if(list.length!=4)return false;
		int c=0;
		for(String s:list){
			try{
				int m=Integer.parseInt(s);
				if(m>=0 && m<=255)c++;
			}
			catch(Exception e){
				return false;
			}
		}
		if(c==4)return true;
		return false;
	}

}
