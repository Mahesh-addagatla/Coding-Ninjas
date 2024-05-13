import java.io.*;
import java.util.* ;

public class Solution {
    public static int[] ninjaAndSortedArrays(int arr1[], int arr2[], int m, int n) {
        // Write your code here.
        int[] ans=new int[m+n];
        int x=0;
        int i=0;
        int j=0;
        while(i<m && j<n){
            if(arr1[i]<arr2[j]){
                ans[x++]=arr1[i++];
            }else{
                ans[x++]=arr2[j++];
            }
        }
        while(i<m){
            ans[x++]=arr1[i++];
        }
        while(j<n){
            ans[x++]=arr2[j++];
        }
        return ans;
    }
}
