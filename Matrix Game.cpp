#include <bits/stdc++.h> 
bool matrixGame(vector<vector<int>> &mat)
{
    // Write your code here
    int n=mat.size();
    vector<vector<int>> res(n,vector<int>(n));
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            res[i][j]=0;
            for(int k=0;k<n;k++){
                res[i][j]+=mat[i][k]*mat[k][j];
            }
        }
    }
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            if(res[i][j]!=mat[i][j])return false;
        }
    }
    return true;
}
