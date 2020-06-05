// 874. 模拟行走机器人
// #easy
// *

package _0874;

import java.util.*;

class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        int n = commands.length;
        if (n == 0) return 0;
        int[] dir = new int[] {0, 1};
        int ans = 0, x = 0, y = 0;
        Set<String> set = new HashSet<>(); 
        for (int i=0;i<obstacles.length;++i) {
            set.add(obstacles[i][0] + "," + obstacles[i][1]);
        }
        for (int i=0;i<n;++i) {
            if (commands[i] == -1) dir = direction(dir, -1);
            else if (commands[i] == -2) dir = direction(dir, -2);
            else {
                int k = commands[i];
                while (k > 0) {
                    x += dir[0];
                    y += dir[1];
                    // Don't use Arrays as keys in a HashMap / HashSet! . 
                    // arrays use the default identity-based Object.hashCode() implementation and there's no way you can override that. 
                    // Use a Set of Lists instead.
                    // if (set.contains(new int[] {x, y})) {
                    //     x -= dir[0];
                    //     y -= dir[1];
                    //     break;
                    // }
                    if (set.contains(x + "," + y)) {
                        x -= dir[0];
                        y -= dir[1];
                        break;
                    }
                    --k;
                }
                ans = Math.max(ans, x * x + y * y);
            }
        }
        return ans;
    }

    private int[] direction(int[] dir, int d) {
        // turn right
        // int[] dirX = new int[] {0, 1, 0,-1};
        // int[] dirY = new int[] {1, 0,-1, 0};
        // turn left
        // int[] dirX = new int[] {0,-1, 0, 1};
        // int[] dirY = new int[] {1, 0,-1, 0};
        int[] ans = new int[2];
        if (d == -1) {
            ans[0] = dir[1];
            ans[1] = 0 - dir[0];
        } else if (d == -2) {
            ans[0] = 0 - dir[1];
            ans[1] = dir[0];
        }
        return ans;
    } 
}