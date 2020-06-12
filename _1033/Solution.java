// 1033. 移动石子直到连续
// #easy
// -

package _1033;

import java.util.Arrays;

class Solution {
    public int[] numMovesStones(int a, int b, int c) {
        int[] k = new int[] {a, b ,c};
        Arrays.sort(k);
        int max = k[2]-k[0]-2;
        int min = 0;
        if (max == 0) min = 0;
        else if (k[1]-k[0] <= 2 || k[2]-k[1] <= 2) min = 1;
        else min = 2;
        return new int[] {min, max};
    }
}
