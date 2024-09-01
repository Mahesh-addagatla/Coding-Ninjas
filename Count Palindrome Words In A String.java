import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static int countNumberOfPalindromeWords(String s) 
	{
        // Write your code here!
        if(s==null || s.isEmpty())return 0;
        int ans=0;
        String[] list=s.split("\\s+");
        for(int i=0;i<list.length;i++){
            String str = list[i];
            if(isPalin(str.toLowerCase()))ans++;
        }
        return ans;
        
    }
    public static boolean isPalin(String str){
        int l=0,h=str.length()-1;
            while(l<h){
                if(str.charAt(l)!=str.charAt(h)){
                    return false;
                }
                l++;
                h--;
            }
            return true;
    }
}
