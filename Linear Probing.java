import java.util.* ;
import java.io.*; 
import java.util.List;

public class Solution {

    public static int[] linearProbing(List<Integer> keys) {
        // Write your code here.
        int n=keys.size();
        int [] ht=new int[n];
        Arrays.fill(ht,0);
        for(int i=0;i<n;i++){
            int k=keys.get(i)%n;
            if(ht[k]==0){
                ht[k]=keys.get(i);
            }
            else{
                while(ht[k]!=0 && k<n){
                    k=k+1;
                    if(k==n)k=0;
                }
                ht[k]=keys.get(i);
            }
        }
        return ht;
    }

}
