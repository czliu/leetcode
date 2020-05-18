// 0475. Heaters
// #easy
//

package _0475;

import java.util.*;

public class Solution {

    public int findRadius(int[] houses, int[] heaters) {
        int n = houses.length;
        int max = Integer.MIN_VALUE;
        Arrays.sort(heaters);
        for (int i=0;i<n;++i) {
            int tmp = minDistance(houses[i], heaters);
            System.out.println(tmp);
            if (tmp > max) max = tmp;
        }
        return max;
    }

    private int minDistance(int h, int[] heaters) {
        int i = 0;
        while (i < heaters.length && h > heaters[i]) ++i;
        if (i >= 1 && i < heaters.length) return Math.min(Math.abs(h-heaters[i-1]), Math.abs(h-heaters[i]));
        else if (i == 0) return Math.abs(h-heaters[i]);
        else return Math.abs(h-heaters[i-1]);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int ans = s.findRadius(new int[] {1,2,3}, new int[] {2});
        System.out.println(ans);
    }
    
}