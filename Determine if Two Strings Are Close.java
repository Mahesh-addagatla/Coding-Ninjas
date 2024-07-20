
import java.util.* ;
import java.io.*; 
public class Solution {
    private static int[] freq(String str){
        int[] fre1=new int[26];
        for(char ch:str.toCharArray()){
            fre1[ch-'a']++;
        }
        Arrays.sort(fre1);
        return fre1;
    }
    public static boolean stringChallenge(String str1, String str2) {
        // Write your code here.
        if(str1.length()!=str2.length())return false;
        int[] fre=new int[26];
        Arrays.fill(fre,0);
        for(char ch:str1.toCharArray()){
            fre[ch-'a']++;
        }
        for(char ch:str2.toCharArray()){
            if(fre[ch-'a']==0)return false;
        }
        return Arrays.equals(freq(str1),freq(str2));
    }
}
