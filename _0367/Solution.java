// 0367. valid perfect square
// #easy
// *

package _0367;

public class Solution {
    public boolean isPerfectSquare(int num) {
        int left = 1;
        int right = num;
        int mid = (right - left) / 2 + left;
        long tmp = (long)mid * mid;  // pay attention to this (long) to avoid overflow
        while (left < right) {
            if (tmp > num) right = mid - 1;
            else if (tmp < num) left = mid + 1;
            else if (tmp == num) return true;
            mid = (right - left) / 2 + left;
            tmp = (long)mid * mid;
        }
        if (tmp == num) return true;
        else return false;
    }
    
    public static void main(String[] args) {
        Solution s = new Solution();
        boolean ans = s.isPerfectSquare(104976);
        System.out.println(ans);
    }
}