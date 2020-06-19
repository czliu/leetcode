// 1370. 上升下降字符串
// #easy
// -

package _1370;

class Solution {
    public String sortString(String s) {
        int n = s.length();
        int[] count = new int[26];
        for (int i=0;i<n;++i) {
            ++count[s.charAt(i) - 'a'];
        }
        StringBuilder sb = new StringBuilder();
        int left = 0, right = 25;
        while (left <= right) {
            for (int i=left;i<=right;++i) {
                if (count[i] > 0) {
                    sb.append((char) ('a' + i));
                    --count[i];
                }
            }
            for (int i=right;i>=left;--i) {
                if (count[i] > 0) {
                    sb.append((char) ('a' + i));
                    --count[i];
                }
            }
            while (left <= 25 && count[left] == 0) ++left;
            while (right >= 0 && count[right] == 0) --right;
        }
        return sb.toString();
    }
}
