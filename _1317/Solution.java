// 1317. 将整数转换为两个无零整数的和
// #easy
// -

package _1317;

class Solution {
    public int[] getNoZeroIntegers(int n) {
        int[] ans = new int[2];
        for (int i = 1; i < n; i++) {
            if (isNoZero(i) && isNoZero(n - i)) {
                return new int[]{i, n - i};
            }
        }
        return ans;
    }

    private boolean isNoZero(int num) {
        while (num > 0) {
            if (num % 10 == 0) {
                return false;
            }
            num /= 10;
        }
        return true;
    }
}
