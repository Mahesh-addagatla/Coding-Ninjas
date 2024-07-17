import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static int largest(int a){
        int ma=0;
        while(a>0){
            int r=a%10;
            if(ma<r)ma=r;
            a=a/10;
        }
        return ma;
    }
    public static int concatLargestDigit(int a, int b, int c)
    {
        //    Write your code here.
        int f1=largest(a);
        int f2=largest(b);
        int f3=largest(c);
        int ans=f1*100+f2*10+f3;
        return ans;
    }
}
