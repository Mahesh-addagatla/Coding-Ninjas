import java.util.* ;
import java.io.*; 
public class Solution {
    private static boolean isMirrorchar(char ch){
        return "AHIMOUTVWXY".indexOf(ch)>=0;
    }
    public static Boolean isReflectionEqual(String s) {
        // Write your code here.
        int len=s.length();

        for(char ch:s.toCharArray()){
            if(!isMirrorchar(ch)){
                return false;
            }
        }
        for(int i=0;i<len/2;i++){
            if(s.charAt(i)!=s.charAt(len-i-1)){
                return false;
            }
        }
        return true;
    }
}
