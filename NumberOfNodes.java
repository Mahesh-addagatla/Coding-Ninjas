public class Solution {
    public static int numberOfNodes(int N){
        // Write your code here.
        if(N==0)return 0;
        return (int)Math.pow(2,N-1);
    }
}
