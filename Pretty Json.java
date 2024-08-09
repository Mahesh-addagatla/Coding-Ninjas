import java.util.* ;
import java.io.*; 
public class Solution {
    public static ArrayList<String> prettyJSON(String str) {
        // Write your code here.
         StringBuilder sb = new StringBuilder();
        int spaces = 0;


        for (char ch : str.toCharArray()) {
            if (ch == '[' || ch == '{') {
                appendIndentation(sb, spaces);
                spaces++;
                sb.append(ch);
                appendIndentation(sb, spaces);
            } else if (ch == ']' || ch == '}') {
                spaces--;
                appendIndentation(sb, spaces);
                sb.append(ch);
            } else {
                sb.append(ch);
                if (ch == ',') {
                    appendIndentation(sb, spaces);
                }
            }
        }


        String[] strArray = sb.toString().trim().split("\n");
        return new ArrayList<>(Arrays.asList(strArray));
    }


    public static void appendIndentation(StringBuilder sb, int spaces) {
        if (sb.length() > 0) {
            sb.append("\n");
        }
        while (spaces > 0) {
            sb.append("    ");
            spaces--;
        }
    }
}
