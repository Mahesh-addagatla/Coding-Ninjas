import java.util.*;
import java.io.*;

public class Solution {
    public static int threePointer(ArrayList<Integer> X, ArrayList<Integer> Y, ArrayList<Integer> Z) {
        int A = X.size();
        int B = Y.size();
        int C = Z.size();
        int i = 0;
        int j = 0;
        int k = 0;
        int ans = Integer.MAX_VALUE;
        while (i < A && j < B && k < C) {
            int maxVal = X.get(i);
            if (Y.get(j) > maxVal)
                maxVal = Y.get(j);
            if (Z.get(k) > maxVal)
                maxVal = Z.get(k);

            int minVal = X.get(i);
            if (Y.get(j) < minVal)
                minVal = Y.get(j);
            if (Z.get(k) < minVal)
                minVal = Z.get(k);

            ans = Math.min(ans, maxVal - minVal);
            if (X.get(i).equals(minVal))
                i++;
            else if (Y.get(j).equals(minVal))
                j++;
            else
                k++;
        }
        return ans;
    }
}
