// 0387. First unique character in a string
// string

package _0387;

import java.util.*;

public class Solution {

    public int firstUniqChar(String s) {
        int[] a = new int[26];
        Arrays.fill(a, -1);
        for (int i=0;i<s.length();++i){
            int t = s.charAt(i) - 'a';
            if (a[t] == -1) a[t] = i;
            else a[t] = -2;
        }
        int ans = -1;
        for (int i=0;i<26;++i){
            if (a[i] >= 0) {
                if (ans == -1) ans = a[i];
                else ans = Math.min(ans, a[i]);
            }
        }
        return ans;
    }

    public static void main(String[] args){
        Solution s = new Solution();
        int ans = s.firstUniqChar("leetcode");
        System.out.println(ans);
    }
}