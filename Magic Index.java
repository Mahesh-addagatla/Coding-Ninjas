import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
    public static int magicIndex(ArrayList<Integer> a, int n) {
        // Write your code here
        int i=0;
        for(int num:a){
            if(num==i)return num;
            i++;
        }
        return -1;
    }
}
