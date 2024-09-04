import java.util.* ;

import java.io.*;

public class Solution {

 

public static ArrayList<ArrayList<Integer>> findTriplets(int[] arr, int n, int K) {

 

// Write your code here.

ArrayList<ArrayList<Integer>> result = new ArrayList<>();

 

//now sort the array

Arrays.sort(arr);

 

for(int i=0; i<n-2; i++){

//to avoid duplicates

if(i>0 && arr[i]==arr[i-1]){

continue;

}

 

int left =i+1;

int right= n-1;

 

while(left<right){

int sum= arr[i]+arr[left]+arr[right];

 

if(sum==K){

ArrayList<Integer> triplets = new ArrayList<>();

triplets.add(arr[i]);

triplets.add(arr[left]);

triplets.add(arr[right]);

result.add(triplets);

 

//move while checking duplicates

 

while(left<right && arr[left]==arr[left+1]){

left++;

}

 

while(left<right && arr[right]==arr[right-1]){

right--;

}

 

//else still move our pointer

left++;

right--;

}else if(sum<K){

left++;

}else{

right--;

}

}

}

return result;

 

}

}
