/*********************************************

 Following is the TreeNode class structure

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

 *********************************************/

import java.util.*;
class Pair{
    TreeNode node;
    int index;
    Pair(TreeNode node,int index){
        
        this.node = node;
        this.index = index;
    }
}
public class Solution {
    public static List<Integer> getTopView(TreeNode root) {
        // Write your code here.
        // add your code
        ArrayList<Integer> ans=new ArrayList<>();
        if(root==null)return ans;
        Map<Integer,Integer> map=new TreeMap<>();
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(root,0));
        while(!q.isEmpty()){
             Pair p = q.remove();
           int index = p.index;
           TreeNode temp = p.node;
        //   map mein add kro
        
           if(!map.containsKey(index)){
                map.put(index, temp.data);
            }
           
           if(temp.left != null){
               q.add(new Pair(temp.left,index-1));
           }
           if(temp.right != null){
               q.add(new Pair(temp.right,index+1));
           }
        }
        for(int val:map.values()){
            ans.add(val);
        }
        return ans;
    }
}
