class Solution
{
    public void transpose(int n,int a[][])
    {
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp=a[j][i];
                a[j][i]=a[i][j];
                a[i][j]=temp;
            }
        }
    }
}
