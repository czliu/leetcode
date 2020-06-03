// 849. 到最近的人的最大距离
// #easy
// -

package _0849;

class Solution {
    public int maxDistToClosest(int[] seats) {
        int innerMaxZero = 0;
        int outerMaxZero = 0;
        int left = 0, right = seats.length - 1;
        int leftZero = 0, rightZero = 0;
        while (seats[left] == 0) {
            ++leftZero;
            ++left;
        }
        while (seats[right] == 0) {
            ++rightZero;
            --right;
        }
        outerMaxZero = Math.max(leftZero, rightZero);
        int start = -1;
        for (int i=left;i<=right;++i) {
            if (start == -1 && seats[i] == 0) start = i;
            else if (start != -1 && seats[i] == 1) {
                int cur = i - start;
                innerMaxZero = Math.max(cur, innerMaxZero);
                start = -1;
            }
        }
        return Math.max(outerMaxZero, (innerMaxZero+1) / 2);
    }
}