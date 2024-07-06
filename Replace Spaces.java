import java.util.* ;
import java.io.*; 
public class Solution {
	public static StringBuilder replaceSpaces(StringBuilder str) {
		// Write your code here.
		StringBuilder s=new StringBuilder("");
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			if(ch==' '){
				s.append("@40");
			}
			else{
				s.append(ch);
			}
		}
		return s;
	}
}
