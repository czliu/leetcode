// 0447. number of boomerangs
// #easy
// -

package _0447;

import java.util.*;

public class Solution {

    public int numberOfBoomerangs(int[][] points) {
        int n = points.length;
        if (n <= 1) return 0;
        int ans = 0;
        for (int i=0;i<n;++i) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int j=0;j<n;++j) {
                if (j == i) continue;
                else {
                    int tmp = squareOfDistance(points[i], points[j]);
                    map.put(tmp, map.getOrDefault(tmp, 0) + 1);
                }
            }
            for (int k : map.keySet()) {
                ans += (map.get(k) * (map.get(k)-1));
            }
        }
        return ans;
    }

    private int squareOfDistance(int[] a, int[] b) {
        return (int)(Math.pow(a[0]-b[0], 2) + Math.pow(a[1]-b[1], 2));
    }
    
}