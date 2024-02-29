public class Solution {
    public static int[] generateFibonacciNumbers(int n) {
        // Write your code here.
        int[] arr=new int[n];
        arr[0]=0;
        if(n==1)return arr;
        arr[1]=1;
        return print(n,arr,2);
    }
    public static int[] print(int n,int[] arr,int i){
        if(i>=n){
            return arr;
        }
        arr[i]=arr[i-2]+arr[i-1];
        return print(n,arr,i+1);
    }
}
