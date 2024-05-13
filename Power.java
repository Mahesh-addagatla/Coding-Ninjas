class Solution
{
      
    long power(int N,int R)
    {
        //Your code her
        long mod=1000000007;
        if(R==0)return 1;
        if(R%2==0){
            long value=power(N,R/2);
            return (value*value)%mod;
        }
        else{
            long value=power(N,R-1);
            return (value*N)%mod;
        }
    }

}
