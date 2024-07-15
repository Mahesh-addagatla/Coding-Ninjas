import java.util.* ;
import java.io.*; 
public class Solution {
    public static Boolean splitString(String str) {
        // Write your code here..
        int n=str.length();
        String s1=(str.substring(0,n/2)).toLowerCase();
        String s2=(str.substring((n/2),n)).toLowerCase();
        //System.out.print(s1+" "+s2);
        int c1=0;
        int c2=0;
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')c1++;
        }
        for(int i=0;i<s2.length();i++){
            char ch=s2.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')c2++;
        }
        return c1==c2;
    }

}
