// 0459. repeated substring pattern
// #easy
// *

package _0459;

public class Solution {

    // brutal force
    // public boolean repeatedSubstringPattern(String s) {
    //     int n = s.length();
    //     if (n <= 1) return false;
    //     for (int size = 1; size <= n/2; ++size) {
    //         int count = 0;
    //         int left = count * size;
    //         int right = (count + 1) * size;
    //         String pattern = s.substring(left, right);
    //         while (left < n && right <= n) {
    //             // System.out.println(s.substring(left, right));
    //             // System.out.println(pattern);
    //             if (!s.substring(left, right).equals(pattern)) break;
    //             ++count;
    //             left = count * size;
    //             right = (count + 1) * size;
    //         }
    //         if (left == n) return true;
    //     }
    //     return false;
    // }


    public boolean repeatedSubstringPattern(String s) {
        return (s+s).substring(1,(s+s).length()-1).contains(s);
    }
    
    public static void main(String[] args) {
        Solution s = new Solution();
        boolean ans = s.repeatedSubstringPattern("abab");
        System.out.println(ans);
    }
}