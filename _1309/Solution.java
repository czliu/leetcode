// 1309. 解码字母到整数映射
// #easy
// -

package _1309;

class Solution {
    public String freqAlphabets(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < n) {
            if (i+2 < n && s.charAt(i+2) == '#') {
                sb.append((char)(Integer.parseInt(s.substring(i, i+2)) - 1 + 'a'));
                i += 3;
            }
            else {
                sb.append((char)(Integer.parseInt(s.substring(i, i+1)) - 1 + 'a'));
                ++i;
            }
        }
        return sb.toString();
    }
}