import java.util.* ;
import java.io.*; 
import java.util.Queue;

public class Solution {
    public static void reverse(Queue<Integer> queue, int k){
        // Write your code here.
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<k;i++){
            st.add(queue.remove());
        }
        while(!st.isEmpty()){
            queue.add(st.pop());
        }
        for(int i=0;i<queue.size()-k;i++){
            queue.add(queue.remove());
        }
    }
}
