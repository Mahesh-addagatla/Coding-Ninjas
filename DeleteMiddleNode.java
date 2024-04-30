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
 };

 *****************************************************************/

public class Solution {
    public static Node deleteMiddle(Node head) {
        // Write your code here.
        if(head==null || head.next==null)return new Node(-1);
        int c=0;
        Node temp=head;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
        int pos=(c/2)+1;
        temp=head;
        while(pos>2){
            temp=temp.next;
            pos--;
        }
        temp.next=temp.next.next;
        return head;

    }
}
