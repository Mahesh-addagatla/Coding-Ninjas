public class Solution
{
    public static Node constructDLL(int []arr) {
        // Write your code here
        Node head=null;
        for(int i=arr.length-1;i>=0;i--){
            Node newNode=new Node(arr[i]);
            if(head==null){
                head=newNode;
            }
            else{
                newNode.next=head;
                head.prev=newNode;
                head=newNode;
            }
        }
        return head;
    }
}
