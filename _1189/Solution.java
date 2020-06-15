// 1189. “气球” 的最大数量
// #easy
// -

package _1189;

class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] count = new int[26];
        for (char c : text.toCharArray()) ++count[c - 'a'];
        int b = count['b' - 'a'];
        int a = count[0];
        int l = count['l' - 'a'];
        int o = count['o' -'a'];
        int n = count['n' - 'a'];
        int ans = b;
        ans = Math.min(ans, a);
        ans = Math.min(ans, l/2);
        ans = Math.min(ans, o/2);
        ans = Math.min(ans, n);
        return ans;
    }
}