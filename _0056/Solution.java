// 0056. Merge intervals

package _0056;

import java.util.*;

public class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0 || intervals == null) return new int[0][];
        List<int[]> ans = new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> a[0]-b[0]);
        int i = 0;
        while (i < intervals.length){
            int[] cur = intervals[i];
            while (i+1 < intervals.length && intervals[i+1][0] <= cur[1]){
                cur[1] = Math.max(cur[1], intervals[i+1][1]);
                i++;
            }
            ans.add(cur);
            i++;
        }
        return ans.toArray(new int[0][]);
    }
}