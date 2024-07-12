import java.util.* ;
import java.io.*; 

public class Solution {
    public static boolean isPeriodic(String s) {
        int n = s.length();
        
        // Check each possible period length from 1 to n/2
        for (int i = 1; i <= n / 2; ++i) {
            if (n % i == 0) {  // Check if the length is a divisor of n
                boolean isP = true;
                String period = s.substring(0, i);
                
                // Check if repeating the substring 'period' n / i times forms the original string
                for (int j = 0; j < n; j++) {
                    if (s.charAt(j) != period.charAt(j % i)) {
                        isP = false;
                        break;
                    }
                }
                
                if (isP) {
                    return true;
                }
            }
        }
        
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPeriodic("abab")); // true
        System.out.println(isPeriodic("aba"));  // false
        System.out.println(isPeriodic("abcabcabcabc")); // true
        System.out.println(isPeriodic("abcd")); // false
    }
}
