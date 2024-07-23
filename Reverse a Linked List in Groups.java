class Solution {
    // Helper method to get the length of the linked list
    public static int getLength(Node head) {
        int len = 0;  // Start with 0, considering an empty list scenario
        while (head != null) {  // Traverse until the end of the list
            head = head.next;
            len++;
        }
        return len;
    }

    // Method to reverse nodes of the linked list in groups of size k
    public static Node reverse(Node node, int k) {
        if (node == null) return null;  // Base case: If the list is empty, return null
        
        // Check if the remaining list length is less than k
        if (getLength(node) < k) return node;

        Node prev = null;
        Node cur = node;
        Node nex = null;
        int c = 0;

        // Reverse the first k nodes of the list
        while (cur != null && c < k) {
            nex = cur.next;  // Store the next node
            cur.next = prev;  // Reverse the current node's pointer
            prev = cur;  // Move prev and cur one step forward
            cur = nex;
            c++;
        }

        // Recursively reverse the remaining list and connect it
        node.next = reverse(cur, k);

        // Return the new head of the reversed list
        return prev;
    }
}
