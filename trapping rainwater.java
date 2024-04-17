static long trappingWater(int arr[], int n) { 
        // Your code here
        int[] left=new int[n];
        int[] right=new int[n];
        left[0]=arr[0];
        right[n-1]=arr[n-1];
        for(int i=1;i<n;i++){
            left[i]=Math.max(left[i],left[i-1]);
        }
        for(int i=n-2;i>=0;i--){
            right[i]=Math.max(right[i+1],right[i]);
        }
        long water=0;
        for(int i=0;i<n;i++){
            int dif=Math.min(left[i],right[i]);
            if(dif>arr[i])water+=dif-arr[i];
        }
        return water;
