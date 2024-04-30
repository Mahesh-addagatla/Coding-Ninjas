class Solution{
    //Function to add two numbers represented by linked list.
    public static Node reverse(Node node){
        if(node==null || node.next==null)return node;
        Node curr=node;
        Node pre=null;
        while(curr!=null){
            Node nex=curr.next;
            curr.next=pre;
            pre=curr;
            curr=nex;
            
        }
        return pre;
    }
    static Node addTwoLists(Node num1, Node num2){
        // code here
        // return head of sum list
        Node first=reverse(num1);
        Node second=reverse(num2);
        Node ans=new Node(-1);
        Node temp=ans;
        int carry=0;
        while(first!=null || second!=null || carry==1){
            int sum=0;
            if(first!=null){
                sum+=first.data;
                first=first.next;
            }
            if(second!=null){
                sum+=second.data;
                second=second.next;
            }
            sum+=carry;
            carry=sum/10;
            //Node nn=new Node(sum%10);
            temp.next=new Node(sum%10);
            temp=temp.next;
            
        }
        Node ans1=reverse(ans.next);
        while(ans1!=null && ans1.data==0)ans1=ans1.next;
        return (ans1==null)?new Node(0):ans1;
        
    }
}
