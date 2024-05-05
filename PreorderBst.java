class BinaryTree
{
    //Function to return a list containing the preorder traversal of the tree.
    static ArrayList<Integer> preorder(Node root)
    {
        // Code here
        
        ArrayList<Integer> ans=new ArrayList<>();
        if(root==null)return ans;
        ans.add(root.data);
        ans.addAll(preorder(root.left));
        ans.addAll(preorder(root.right));
        return ans;
        
    }

}
