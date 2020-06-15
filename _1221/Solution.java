// 1221. 分割平衡字符串
// #easy
// -

package _1221;

class Solution {
    public int balancedStringSplit(String s) {
        int sum = 0, count = 0;
        for (int i=0;i<s.length();++i) {
            if (s.charAt(i) == 'L') ++sum;
            else --sum;
            if (sum == 0) ++count;
        }
        return count;
    }
}
