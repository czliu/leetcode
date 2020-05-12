// 0455. Assign cookies
// #easy
// -

package _0455;

import java.util.*;

public class Solution {

    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int ans = 0;
        int j = 0;
        for (int i=0;i<g.length;++i){
            while (j < s.length) {
                if (g[i] <= s[j]) {
                    ++ans;
                    ++j;
                }
            }
            
        }
        return ans;
    }
    
}