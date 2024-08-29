import java.util.* ;
import java.io.*; 
public class Solution 
{
	public static boolean isArmstrong(int num)
	{
	    // wrtie your code here;
		int len=Integer.toString(num).length();
		int sum=0;
		int temp=num;
		while(temp>0){
			int r=temp%10;
			sum+=Math.pow(r,len);
			temp/=10;
		}
		if(sum==num)return true;
		return false;
	}
}

