/************************************************************

 Following is the Binary Tree TreeNode structure:

 class TreeNode {
     int data;
     TreeNode left;
     TreeNode right;

     TreeNode(int data) {
         this.data = data;
         this.left = null;
         this.right = null;
     }
 }

 ************************************************************/

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private static boolean isLeaf(TreeNode root){
        return root.left==null && root.right==null;
    }
    private static void addLeft(ArrayList<Integer> ans,TreeNode root){
        TreeNode cur=root.left;
        while(cur!=null){
            if(!isLeaf(cur))ans.add(cur.data);
            if(cur.left!=null)cur=cur.left;
            else cur=cur.right;
        }
    }
    private static void addRight(ArrayList<Integer> ans,TreeNode root){
        TreeNode cur=root.right;
        ArrayList<Integer> temp = new ArrayList<>();
        while(cur!=null){
            if(!isLeaf(cur))temp.add(cur.data);
            if(cur.right!=null)cur=cur.right;
            else cur=cur.left;
        }
        for(int i=temp.size()-1;i>=0;i--){
            ans.add(temp.get(i));
        }
    }
    private static void addLeaves(ArrayList<Integer> ans,TreeNode root){
        if(root==null)return;
        if(isLeaf(root))ans.add(root.data);
        addLeaves(ans,root.left);
        addLeaves(ans,root.right);
    }
    public static List<Integer> traverseBoundary(TreeNode root){
        // Write your code here.
        ArrayList<Integer> ans =new ArrayList<>();
        if(!isLeaf(root))ans.add(root.data);
        addLeft(ans,root);
        addLeaves(ans,root);
        addRight(ans,root);
        return ans;
    }
}
