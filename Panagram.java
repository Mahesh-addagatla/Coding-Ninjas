class Solution
{
    //Function to check if a string is Pangram or not.
    public static boolean checkPangram  (String s) {
        // your code here
        int[] alp=new int[26];
        Arrays.fill(alp,0);
        s=s.toLowerCase();
        for(int i=0;i<s.length();i++){
            if('a'<=s.charAt(i)&& s.charAt(i)<='z'){
                alp[s.charAt(i)-'a']++;
            }
        }
        for(int i=0;i<26;i++){
            if(alp[i]==0)return false;
        }
        return true;
    }
}
