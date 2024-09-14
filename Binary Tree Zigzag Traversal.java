import java.util.* ;
import java.io.*; 
/*
	Following is the class used to represent the object/node of the Binary Tree

	class BinaryTreeNode<T> {
	    T data;
	    BinaryTreeNode<T> left;
	    BinaryTreeNode<T> right;

	    public BinaryTreeNode(T data) {
	        this.data = data;
	    }
	}
*/

public class Solution {

    public static List<Integer> zigZagTraversal(BinaryTreeNode<Integer> root) {

        // Write your code here!

 

// List to store the zigzag traversal result

        List<Integer> result = new ArrayList<>();

        

        // Check if the root is null

        if (root == null) return result;

        

        // Queue for BFS

        Queue<BinaryTreeNode<Integer>> queue = new LinkedList<>();

        queue.add(root);

        

        // Boolean flag to toggle direction

        boolean leftToRight = true;

        

        while (!queue.isEmpty()) {

            int levelSize = queue.size();

            List<Integer> level = new ArrayList<>(levelSize);

            

            for (int i = 0; i < levelSize; i++) {

                BinaryTreeNode<Integer> node = queue.poll();

                

                // Add the node value in the required order

                if (leftToRight) {

                    level.add(node.data);

                } else {

                    level.add(0, node.data); // Insert at the beginning for reverse order

                }

                

                // Add child nodes to the queue

                if (node.left != null) queue.add(node.left);

                if (node.right != null) queue.add(node.right);

            }

            

            // Add the current level to the result

            result.addAll(level);

            

            // Toggle the direction for the next level

            leftToRight = !leftToRight;

        }

        

        return result;

    }

}
