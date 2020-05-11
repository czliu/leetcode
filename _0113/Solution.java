// 0113. path sum II
// #medium #binarytree #backtrack
// *
// related: 112. path sum

package _0113;

import java.util.*;
import structure.TreeNode;

public class Solution {

    List<List<Integer>> ans;

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        ans = new ArrayList<>();
        if (root == null)
            return ans;
        backTrack(root, sum, 0, new ArrayList<>());
        return ans;
    }

    private void backTrack(TreeNode x, int sum, int curSum, List<Integer> vals) {
        vals.add(x.val);
        curSum += x.val;
        if (x.left == null && x.right == null) {
            if (curSum == sum) {
                ans.add(new ArrayList<>(vals));
            }
            vals.remove(vals.size() - 1);
            return;
        }
        if (x.left != null)
            backTrack(x.left, sum, curSum, vals);
        if (x.right != null)
            backTrack(x.right, sum, curSum, vals);
        vals.remove(vals.size() - 1);
    }
}