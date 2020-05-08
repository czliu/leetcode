// 0040. combination sum II
// *
// #medium #backtrack
// related : 0039. Combination Sum

package _0040;

import java.util.*;

class Solution {

    List<List<Integer>> ans =  new LinkedList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        LinkedList<Integer> track = new LinkedList<>();
        backtrack(candidates, 0, target, track);
        return ans;
    }

    private void backtrack(int[] candidates, int start, int target, LinkedList<Integer> track){
        if (target < 0) return;
        if (target == 0){
            ans.add(new LinkedList<>(track));
            return;
        }
        for(int i = start;i < candidates.length;++i) {
            if(target < candidates[i]) break;
            track.add(candidates[i]);
            backtrack(candidates,i+1,target-candidates[i],track);
            track.removeLast();
            while(i+1 < candidates.length && candidates[i] == candidates[i+1]) ++i;
        }
    }
}
