// 0046. Permutations
// *
// #medium #backtrack
// related : 47. permutations II

package _0046;

import java.util.*;

public class Solution {

    List<List<Integer>> ans = new LinkedList<>();

    public List<List<Integer>> permute(int[] nums) {
        LinkedList<Integer> track = new LinkedList<>();
        backTrack(nums, track);
        return ans;
    }

    private void backTrack(int[] nums, LinkedList<Integer> track){
        if (track.size() == nums.length) {
            ans.add(new LinkedList<>(track));
            return;
        }
        for (int i = 0; i < nums.length; ++i) {
            // 排除不合法的选择
            if (track.contains(nums[i]))
                continue;
            // 做选择
            track.add(nums[i]);
            // 进入下一层决策树
            backTrack(nums, track);
            // 取消选择
            track.removeLast();
        }
    }
}