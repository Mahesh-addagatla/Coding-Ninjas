import java.util.* ;
import java.io.*; 
public class Solution {

    public static List<Long> multiplication(int[] arr) {
        int n = arr.length;
        List<Long> ans = new ArrayList<>();

        PriorityQueue<Long> pq = new PriorityQueue(Collections.reverseOrder());

        for(int i = 0; i<n; i++){
            pq.add((long) arr[i]);

	        if(i <= 1) {
	            ans.add(-1l);
	            continue;
	        }

            long a = pq.poll();
            long b = pq.poll();
            long c = pq.poll();

            ans.add(a*b*c);

            pq.add(a);
            pq.add(b);
            pq.add(c);
        }

        return ans;
        
    }

}
