// 859. 亲密字符串
// #easy
// -

package _0859;

class Solution {
    public boolean buddyStrings(String A, String B) {
        if (A.length() != B.length()) return false;
        int n = A.length();
        if (n <= 1) return false;
        int countNotSame = 0;
        int[] countA = new int[26];
        int[] countB = new int[26];
        for (int i=0;i<n;++i) {
            if (A.charAt(i) != B.charAt(i)) ++countNotSame;
            ++countA[A.charAt(i) - 'a'];
            ++countB[B.charAt(i) - 'a'];
        }
        if (countNotSame > 2 || countNotSame == 1) return false;
        for (int i=0;i<26;++i) {
            if (countA[i] != countB[i]) return false;
        }
        if (countNotSame == 0) {
            for (int i=0;i<26;++i) {
                if (countA[i] >= 2) return true;
            }
            return false;
        } 
        return true;
    }
}