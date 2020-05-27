// 744. 寻找比目标字母大的最小字母
// #easy
// -

package _0744;

public class Solution {

    public char nextGreatestLetter(char[] letters, char target) {
        for (int i = 0; i < letters.length; ++i) {
            if (letters[i] - target > 0) return letters[i];
        }
        return letters[0];
    }
    
}