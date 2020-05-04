// 0045. Jump game II
// *
// #hard #dp

package _0045;

import java.util.*;

public class Solution {

    public int jump(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;
        int[] tmp = new int[n];
        Arrays.fill(tmp, -1);
        tmp[0] = 0;
        for (int i = 0; i < n; ++i) {
            if (tmp[i] == -1) continue;
            for (int j=1;j<=nums[i] && i+j<n;++j){
                if (tmp[i+j] == -1) tmp[i+j] = tmp[i]+1;
                else tmp[i+j] = Math.min(tmp[i+j], tmp[i]+1);
            }
        }
        return tmp[n-1];
    }
    
}