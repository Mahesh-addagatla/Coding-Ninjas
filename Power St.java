import java.util.* ;
import java.io.*; 
public class Solution {
	public static ArrayList<ArrayList<Integer>> pwset(ArrayList<Integer> arr) {
		// WRITE YOUR CODE HERE
		ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

 

        for(int i = 0; i<(1<<arr.size()); i++){

            ArrayList<Integer> temp = new ArrayList<>();

            for(int j = 0; j<arr.size(); j++){

                if((i&(1<<j)) > 0){

                    temp.add(arr.get(j));

                }

            }

            ans.add(temp);

        }

 

        return ans;
	}
}

