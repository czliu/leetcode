// 0112. Path Sum
// #easy #binarytree
// *
// related : 113. Path sum II

package _0112;

// import java.util.*;

import structure.TreeNode;

class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) return false;
        sum -= root.val;
        if (root.left == null && root.right == null) return sum == 0;
        return hasPathSum(root.left, sum) || hasPathSum(root.right, sum);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        TreeNode root1 = TreeNode.createTree("[3,9,20,null,null,15,7]");
        boolean result1 = s.hasPathSum(root1, 30);
        System.out.println(result1);
        TreeNode root2 = TreeNode.createTree("[1,2]");
        boolean result2 = s.hasPathSum(root2, 1);
        System.out.println(result2);
    }
}
