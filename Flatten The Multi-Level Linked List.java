import java.util.* ;

//import org.w3c.dom.Node;

import java.io.*; 
/*******************************************************

	Following is the Node class structure

	class Node {
	    int data;
	    Node next;
	    Node child;
	    
	    public Node(int data) {
	        this.data = data;
	    }
	}

*******************************************************/

public class Solution {
    
    public static Node flattenMultiLinkedList(Node head) {
        // Write you code here.
		Node cur=head;
		Node prev=head;
		while(prev!=null){
			while(cur!=null && cur.next!=null){
				cur=cur.next;
			}
			if(prev.child!=null){
				cur.next=prev.child;
				prev.child=null;
			}
			prev=prev.next;
		}
		return head;
    }

}
