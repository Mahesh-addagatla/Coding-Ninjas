public class Solution {

    public static int[] getProductArrayExceptSelf(int[] arr) {
       int MOD = 1000000007;

        int n =  arr.length;

        int[]output = new int[n];

        if(n<1) return output;  //edge case

 

        int product = 1;

        for(int i=0;i<n;i++){

            product = (int)(((long)product * arr[i])%MOD);

            output[i] = product;

        }

 

        int products = 1;

        for(int i=n-1; i>0; i--){

            output[i] = (int)(((long)output[i-1] * products)%MOD);

            products = (int)(((long)products * arr[i])%MOD);

        }

        output[0] = products;

        return output;
    }
    }
