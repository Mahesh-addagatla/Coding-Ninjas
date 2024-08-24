class Solution{   
public:
    long long int nthMagicNo(int n) { 
        //complete the function here
        long ans=0;
        long base=5;
        int mod=1000000007;
         while(n>0) {
             long last=n&1;
             n=n>>1;
             ans+=base%mod*last;
             base*=5%mod;
             
         }
         return ans%mod;
    }
};
