import java.util.HashSet;

public class Solution {
    public static int longestSuccessiveElements(int []a) {
        // Write your code here.
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<a.length;i++){
            hs.add(a[i]);
        }
        int len=1;
        for(int s:hs){
            if(!hs.contains(s-1)){
                int x=s;
                int c=1;
                while(hs.contains(x+1)){
                    x=x+1;
                    c+=1;
                }
            len=Math.max(len,c);
            }
        }
        return len;
    }
}
