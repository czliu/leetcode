// 796. 旋转字符串
// #easy
// -

package _0796;

class Solution {
    public boolean rotateString(String A, String B) {
        if (A.length() != B.length()) return false;
        String AA = A + A;
        return AA.contains(B);
    }
}