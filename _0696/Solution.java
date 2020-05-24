// 696. 计数二进制子串
// #easy
// *

package _0696;

public class Solution {

    public int countBinarySubstrings(String s) {
        int n = s.length();
        if (n <= 1) return 0;
        int ans = 0, pre = 0, cur = 1;
        for (int i = 1; i < s.length(); ++i) {
            if (s.charAt(i-1) != s.charAt(i)) {
                ans += Math.min(pre, cur);
                pre = cur;
                cur = 1;
            } else {
                ++cur;
            }
        }
        return ans + Math.min(pre, cur);
    }

    // 超出时间限制
    // public int countBinarySubstrings(String s) {
    //     int n = s.length();
    //     if (n == 0) return 0;
    //     int ans = 0;
    //     for (int i=0;i<n;++i) {
    //         int cur = s.charAt(i);
    //         int count = 0;
    //         boolean sameAsCur = true;
    //         for (int j=i;j>=0;--j) {
    //             if (s.charAt(j) == cur) {
    //                 if (sameAsCur == true) ++count;
    //                 else break;
    //             }
    //             else {
    //                 if (sameAsCur == true) sameAsCur = false;
    //                 --count;
    //                 if (count == 0) {
    //                     ++ans;
    //                     break;
    //                 }
    //             }
    //         } 
    //     }
    //     return ans;
    // }
    
}