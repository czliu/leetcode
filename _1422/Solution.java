// 1422. 分割字符串的最大得分
// #easy
// -

package _1422;

class Solution {
    public int maxScore(String s) {
        int count0 = 0, count1 = 0;
        for (int i=0;i<s.length();++i) {
            if (s.charAt(i) == '0') ++count0;
            else ++count1;
        }
        int max = 0;
        int left0 = 0, right1 = count1;
        for (int i=0;i<=s.length()-2;++i) {
            if (s.charAt(i) == '0') ++left0;
            else --right1;
            int cur = left0 + right1;
            max = Math.max(max, cur);
        }
        return max;
    }
}