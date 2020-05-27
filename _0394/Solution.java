// 394. 字符串解码
// #medium
// -

package _0394;

public class Solution {

    public String decodeString(String s) {

        String ans = "";
        int n = s.length();
        if (n == 0) return ans;
        int i = 0, repeat = 0;
        while (i < n) {
            // digits
            if (type(s.charAt(i)) == 0) {
                int j = i + 1;
                while (j < n && type(s.charAt(j)) == 0) ++j;
                repeat = Integer.valueOf(s.substring(i, j));
                int count = 1, k = j + 1;
                while (k < n && count > 0) {
                    if (type(s.charAt(k)) == 1) ++count;
                    else if (type(s.charAt(k)) == 2) --count;
                    if (count == 0) break;
                    ++k;
                }
                String inside = decodeString(s.substring(j+1, k));
                while (repeat > 0) {
                    ans += inside;
                    --repeat;
                }
                i = k + 1;
            } else if (type(s.charAt(i)) == 3) {
                int j = i + 1;
                while (j < n && type(s.charAt(j)) == 3) ++j;
                ans += s.substring(i, j);
                i = j;
            }
        }
        return ans;
    }

    private int type(char c) {
        if (c - '0' >= 0 && '9' - c >= 0) return 0; 
        if (c == '[') return 1;
        if (c == ']') return 2;
        return 3;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String ans = s.decodeString("3[a]2[bc]");
        System.out.println(ans);
        ans = s.decodeString("3[a2[c]]");
        System.out.println(ans);
        ans = s.decodeString("2[abc]3[cd]ef");
        System.out.println(ans);
    }
    
}