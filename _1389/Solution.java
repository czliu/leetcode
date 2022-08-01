// 1389. 按既定顺序创建目标数组
// #easy
// -

package _1389;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new ArrayList<>();
        for (int i=0;i<nums.length;++i) {
            list.add(index[i], nums[i]);
        }
        int[] ans = new int[list.size()];
        int i = 0;
        for (int k : list) ans[i++] = k;
        return ans;
    }
}