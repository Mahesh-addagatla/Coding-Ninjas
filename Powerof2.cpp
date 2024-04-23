bool isPowerOfTwo(int n)
{	
    // Write your code here.
    if(n<=0)return false;
    int k=n;
    if((k&k-1)==0)return true;
    return false;
}
