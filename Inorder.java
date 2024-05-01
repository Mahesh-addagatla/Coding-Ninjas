import java.util.*;

public class Solution {
    public static void inorder(TreeNode root,List<Integer> ans){
        if(root==null)return;
        // Write your code here.
        inorder(root.left,ans);
        ans.add(root.data);
        inorder(root.right,ans);
    }
    public static List< Integer > getInOrderTraversal(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        inorder(root,ans);
        return ans;
    }
}
