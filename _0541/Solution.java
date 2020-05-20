// 0541. reverse string II
// #easy
// -

package _0541;

public class Solution {

    public String reverseStr(String s, int k) {
        int n = s.length();
        if (n == 0) return s;
        char[] c = s.toCharArray();
        int i = 0;
        while (i < n) {
            // If there are less than k characters left, reverse all of them.
            if (n - i < k) {
                reverse(c, i, n-1);
                break;
            }
            // If there are less than 2k but greater than or equal to k characters, then reverse the first k characters and left the other as original.
            else if (n - i < 2 * k) {
                reverse(c, i, i + k - 1);
                break;
            }
            else { // n-i>=2k
                reverse(c, i, i + k - 1);
                i += (2 * k);
            }
        }
        return String.valueOf(c);
    }

    private void reverse(char[] c, int i, int j) {
        while (i < j) {
            char tmp = c[i];
            c[i] = c[j];
            c[j] = tmp;
            ++i;
            --j;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String ans = s.reverseStr("abcdefg", 2);
        System.out.println(ans);
    }
    
}