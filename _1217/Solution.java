// 1217. 玩筹码
// #easy
// -

package _1217;

class Solution {
    public int minCostToMoveChips(int[] chips) {
        int odd = 0, even = 0;
        for (int k : chips) {
            if (k % 2 == 1) ++odd;
            else ++even;
        }
        return Math.min(odd, even);
    }
}