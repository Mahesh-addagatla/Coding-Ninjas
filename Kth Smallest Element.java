import java.util.PriorityQueue;

public class Solution {
    public static int kthSmallest(int n,int k, int[]arr) {
        // Write your code here.
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i:arr)pq.add(i);
        int i=1;
        while(i<k){
            pq.remove();
            i++;
        }
        return pq.peek();
    }
}
