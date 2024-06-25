import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

    public static int minNumToWin(int n, int mishaNum) {
        //    Write your code here.
        int mid=n/2;
        if(mishaNum<=mid){
            return mishaNum+1;
        }else{
            return mishaNum-1;
        }
    }
}
