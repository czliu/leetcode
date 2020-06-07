// 917. 仅仅反转字母
// #easy
// -

package _0917;

class Solution {
    public String reverseOnlyLetters(String S) {
        int n = S.length();
        if (n == 0) return S;
        char[] C = S.toCharArray();
        int left = 0, right = n - 1;
        while (left < right) {
            while (left < right && !Character.isLetter(C[left])) ++left;
            while (left < right && !Character.isLetter(C[right])) --right;
            if (left < right && Character.isLetter(C[left]) && Character.isLetter(C[right])) {
                char tmp = C[left];
                C[left] = C[right];
                C[right] = tmp;
                ++left;
                --right;
            }
        }
        return String.valueOf(C);
    }
}
