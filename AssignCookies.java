int assignCookie(vector<int> &greed, vector<int> &size) {
	// Write your code here.
		sort(greed.begin(),greed.end());
		sort(size.begin(),size.end());
		int j=size.size()-1;
        int c=0;
        for(int i=greed.size()-1;i>=0;i--){
            if(greed[i]<=size[j]){
                c++;
                j--;
            }
        }
        return c;
}
