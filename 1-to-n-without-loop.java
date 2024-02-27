public class Solution {
    public static int[] printNos(int x) {
        // Write Your Code Here
        int a[]=new int[x];
        return printArr(a,x);
    }
    public static int[] printArr(int a[],int x){
        if(x>0){
            a[x-1]=x;
            printArr(a,x-1);
        }
        return a;
    }
}
