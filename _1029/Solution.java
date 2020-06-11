// 1029. 两地调度
// #easy
// -

package _1029;

import java.util.Arrays;

class Solution {
    public int twoCitySchedCost(int[][] costs) {
        int n = costs.length / 2;
        int[] diff = new int[n * 2];
        for (int i=0;i<2*n;++i) {
            diff[i] = costs[i][0] - costs[i][1];
        }
        Arrays.sort(diff);
        int t = diff[n];
        int sum = 0, countB = 0;
        for (int i=0;i<2*n;++i) {
            if (costs[i][0] - costs[i][1] > t) {
                sum += costs[i][1];
                ++countB;
            }
            else if (costs[i][0] - costs[i][1] < t) {
                sum += costs[i][0];
            }
        }
        for (int i=0;i<2*n;++i) {
            if (costs[i][0] - costs[i][1] == t) {
                if (countB < n) {
                    sum += costs[i][1];
                    ++countB;
                } else sum += costs[i][0];
            }
        }
        return sum;
    }
}