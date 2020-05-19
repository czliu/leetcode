// 1371. find the longest substring containing vowels in even counts
// #medium
// *

package _1371;

import java.util.*;

public class Solution {

    //将5个元音字母出现次数的奇偶视为一种状态，一共有32种状态，不妨使用一个整数代表状态，第0位为1表示a出现奇数次，第一位为1表示e出现奇数次……以此类推。仅有状态0符合题意。
    //而如果子串[0，i]与字串[0,j]状态相同，那么字串[i+1,j]的状态一定是0，因此可以记录每个状态第一次出现的位置，此后再出现该状态时相减即可。
    //需要注意状态0首次出现的位置应该设定为-1。
    //在计算状态的时候可以利用异或运算。

    public int findTheLongestSubstring(String s) {
        int n = s.length();
        int[] pos = new int[1 << 5];
        Arrays.fill(pos, -1);
        int ans = 0, status = 0;
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == 'a') {
                status ^= (1 << 0);
            } else if (ch == 'e') {
                status ^= (1 << 1);
            } else if (ch == 'i') {
                status ^= (1 << 2);
            } else if (ch == 'o') {
                status ^= (1 << 3);
            } else if (ch == 'u') {
                status ^= (1 << 4);
            }
            
            if (status == 0) {
                ans = i - pos[status];
            }
            else if (status > 0 && pos[status] >= 0) {
                ans = Math.max(ans, i - pos[status]);
            } else {
                pos[status] = i;
            }
        }
        return ans;
    }
  
}