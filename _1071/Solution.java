// 0039. Combination Sum
// 回溯法
// 复习


package _0039;

import java.util.*;

class Solution {

    List<List<Integer>> ans =  new LinkedList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        LinkedList<Integer> track = new LinkedList<>();
        Arrays.sort(candidates);
        backtrack(candidates, 0, target, track);
        return ans;
    }

    private void backtrack(int[] candidates, int start, int target, LinkedList<Integer> track) {
        if (target < 0) return;
        if (target == 0){
            ans.add(new LinkedList<>(track));
            return;
        }
        for(int i = start;i < candidates.length;i++){
            if(target < candidates[i]) break;
            track.add(candidates[i]);
            backtrack(candidates,i,target-candidates[i],track);
            track.removeLast();
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {2,3,5};
        List<List<Integer>> output = s.combinationSum(nums, 8);
        for (List<Integer> i:output) System.out.println(i);
    }
}
