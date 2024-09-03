/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;

     Node()
     {
         this.data = 0;
         this.next = null;
     }
     Node(int data)
     {
         this.data = data;
         this.next = null;
     }
     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
     }
 }

 *****************************************************************/

public class Solution {
    public static int findIntersection(Node firstHead, Node secondHead) {
        //Write your code here
         if(firstHead == null || secondHead == null) return 0;

        Node dummy1 = firstHead;
        Node dummy2 = secondHead;

        while(dummy1 != dummy2){
            dummy1 = dummy1 == null ? secondHead : dummy1.next;
            dummy2 = dummy2 == null ? firstHead : dummy2.next;
        }

        return dummy1.data;
    }
}
