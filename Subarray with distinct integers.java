#include <bits/stdc++.h> 

//Basically, Sliding Window/2 pointer APPROACH

//we use MAP to use map size to compaare with b

//Whenever size > b, we stop the j pointer, and move i, so size reducces

int helper(vector<int>& arr, int n, int b){

    int i=0, j=0, count=0;

    unordered_map<int, int> mpp;

    while(j<n){

        mpp[arr[j]]++;

        while(mpp.size()>b && i<=j){

            mpp[arr[i]]--;

            if(mpp[arr[i]]==0) mpp.erase(arr[i]);

            i++;

        }

        count += j-i+1;

        j++;

    }

    return count;

}

int goodSubarrays(vector<int>& arr, int n, int b)

{

    //DOING ATMOST TECHNIQUE

    return helper(arr, n, b) - helper(arr, n, b-1);

}
