// 0443. string compression
// #easy #string #review

package _0443;

public class Solution {

    public int compress(char[] chars) {
        int n = chars.length;
        if (n == 0) return 0;
        int cur = 0;
        int j = 0; // write index
        for (int i=0;i<n;++i){
            if (i + 1 == n || chars[i+1] != chars[cur]) {
                if (i - cur == 0) {
                    chars[j++] = chars[cur];
                    cur = i + 1;
                }
                else {
                    chars[j++] = chars[cur];
                    for (char c : ("" + (i - cur + 1)).toCharArray()) chars[j++] = c; // review
                    cur = i + 1;
                }
            }
        }
        return j;
    }
}