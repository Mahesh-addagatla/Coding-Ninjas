import java.util.* ;

import java.io.*; 

public class Solution

{

    static int kadane(int []arr,int n)

    {

        int maxvalue = Integer.MIN_VALUE;

        int index = -1;

        int currsum = 0;

        for(int i=0; i<n; ++i)

        {

            currsum+=arr[i];

            if(currsum<0)

            {

                currsum=0;

            }

            else if(currsum>maxvalue)

            {

                maxvalue = currsum;

                index = i;

            }

        }

        if(index!=-1)

        {

            return maxvalue;

        }

        Arrays.sort(arr);

        return arr[arr.length-1];

    }

public static int maxSumRectangle(int[][] arr, int n, int m)

    {

        // Write your code here.

        int maxvalue = Integer.MIN_VALUE;

        int sumarr[] = new int[n];

        for(int left=0; left<m; ++left)

        {

            Arrays.fill(sumarr,0);

            for(int right=left; right<m; ++right)

            {

                for(int i=0; i<n; ++i)

                {

                    sumarr[i]+=arr[i][right];

                }

                int sum = kadane(sumarr,n);

                if(sum>maxvalue)

                {

                    maxvalue = sum;

                }

            }

        }

        return maxvalue;

    }

}
