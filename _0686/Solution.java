// 686. 重复叠加字符串匹配
// #easy
// -

package _0686;

public class Solution {

    public int repeatedStringMatch(String A, String B) {
        int lenA = A.length();
        int lenB = B.length();
        int n = lenB / lenA;
        String nA = "";
        int i = n;
        while (i > 0) {
            nA += A;
            --i;
        }
        if (nA.contains(B)) return n;
        nA += A;
        if (nA.contains(B)) return n + 1;
        nA += A;
        if (nA.contains(B)) return n + 2;
        return -1;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int ans = s.repeatedStringMatch("abc", "cabcabca");
        System.out.println(ans);
    }
    
}