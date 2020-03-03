// 0003. Longest Substring Without Repeating Characters
// Hashmap, 滑动窗口

package _0003;

import java.util.*;

class Solution {

    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int n = s.length(), ans = 0;
        for (int i=0,j=0;j<=n-1;j++) {
            if (map.containsKey(s.charAt(j))) i = Math.max(map.get(s.charAt(j))+1, i);
            ans = Math.max(ans, j-i+1);
            map.put(s.charAt(j), j);
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String input = "pwwkew";
        int output = s.lengthOfLongestSubstring(input);
        System.out.println(output);
    }
}
