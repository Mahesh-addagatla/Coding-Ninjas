public class Solution {
        public static int[] moveZeros(int n, int []arr) {
        // Write your code here.
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[count++]=arr[i];
            }
        }
        while(count<n){
            arr[count++]=0;
        }
        return arr;
    }
}
