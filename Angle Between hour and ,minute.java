import java.util.* ;
import java.io.*; 
public class Solution {
    public static int findAngle(int hour, int minute) {
        //Write your code here
        double ans =Math.abs((30*hour)+(0.5 * minute)-(6*minute));
        double temp=360-ans;
        double a=Math.abs(Math.min(ans,temp));
        if(a==360)return 0;
        return (int)a;

        //return ans;
    }
}
