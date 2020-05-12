// 0520. Detect capital
// #easy
// -

package _0520;

public class Solution {

    public boolean detectCapitalUse(String word) {
        int n = word.length();
        if (n <= 1) return true;
        if (isCapital(word.charAt(0))) {
            if (isCapital(word.charAt(1))) {
                for (int i = 2; i < n; ++i) {
                    if (!isCapital(word.charAt(i))) return false;
                }
            }
            else {
                for (int i = 2; i < n; ++i) {
                    if (isCapital(word.charAt(i))) return false;
                }
            }
        }
        else {
            for (int i = 1; i < n; ++i) {
                if (isCapital(word.charAt(i))) return false;
            }
        }
        return true;
    }

    private boolean isCapital(char c) {
        if (c - 'A' >= 0 && 'Z' - c >= 0) return true;
        else return false;
    }
    
}