// 0345. Reverse vowels of a string

// string

package _0345;

public class Solution {

    public String reverseVowels(String s) {
        int n = s.length();
        if (n == 0) return s;
        char[] c = s.toCharArray();
        int l=0, r=n-1;
        while (l < r) {
            if (!isVowel(c[l])) {
                ++l;
                continue;
            }
            else if (!isVowel(c[r])) {
                --r;
                continue;
            }
            else {
                char tmp = c[l];
                c[l] = c[r];
                c[r] = tmp;
                ++l;
                --r;
            }
        }
        s = new String(c);
        return s;
    }

    private boolean isVowel(char c) {
        if (c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U') return true;
        else return false;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String a = "hello";
        System.out.println(s.reverseVowels(a));
    }
}