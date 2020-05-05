// 0007. reverse integer
// *
// #easy

package _0007;

public class Solution {

    public int reverse(int x) {

        int ans = 0;
        while (x != 0) {
            int tmp = x % 10;
            x = x / 10;
            //*
            if (ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && tmp > Integer.MAX_VALUE % 10)) {
                ans = 0;
                break;
            }
            else if (ans < Integer.MIN_VALUE / 10 || (ans == Integer.MIN_VALUE / 10 && tmp < Integer.MIN_VALUE % 10)) {
                ans = 0;
                break;
            }
            //*
            ans = ans * 10 + tmp;
        }
        return ans;
    }
}