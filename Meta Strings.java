import java.util.*;
import java.io.*;

public class Solution {
    public static boolean checkMeta(String str1, String str2) {
        // Write your code here.
        if (str1.length() != str2.length())
            return false;
        ArrayList<Integer> miss=new ArrayList<>();
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)!=str2.charAt(i))miss.add(i);
        }
        int c=miss.size();
        if(c<2)return false;
        else if(c>2)return false;
        int i1=miss.get(0);
        int i2=miss.get(1);

        return (str1.charAt(i1)==str2.charAt(i2))&&(str1.charAt(i2)==str2.charAt(i1));
    }
}
