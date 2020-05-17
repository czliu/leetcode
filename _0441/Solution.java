// 0441. arranging coins
// #easy
// *

package _0441;

public class Solution {

    public int arrangeCoins(int n) {
        int left = (int)Math.sqrt(n);
        int right = n;
        while (left+1 < right) {
            int mid = (right - left) / 2 + left;
            long m = helper(mid);
            if (m > n) right = mid;
            else if (m < n) left = mid;
            else return mid;
        }
        return left;
    }

    private long helper(int n) {
        long m = ((long)n * (n+1)) / 2;
        return m;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int ans = s.arrangeCoins(2147483647);
        System.out.println(ans);
    }
    
}