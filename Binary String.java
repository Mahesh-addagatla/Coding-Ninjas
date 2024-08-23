import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List< String > generateString(int N) {
        // Write your code here.
        ArrayList<String> ans=new ArrayList<>();
        String s="";
        generateBinary(N,ans,s);
        return ans;
    }
    public static void generateBinary(int N,ArrayList<String> ans,String s){
        if(s.length()==N){
            ans.add(s);
            return;
        }
        generateBinary(N,ans,s+"0");
        if(s.length()==0 || s.charAt(s.length()-1)!='1'){
            generateBinary(N,ans,s+"1");
        }
    }
}
