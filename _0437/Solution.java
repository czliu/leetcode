// 0437. Path Sum III
// BT 二叉树, recursion 递归

package _0437;

// import java.util.*;

import structure.TreeNode;

class Solution {

    public int pathSum(TreeNode root, int sum) {
        return helper(root, sum, new int[1000], 0);
    }

    private int helper(TreeNode root, int sum, int[] array, int level) {
        if (root == null) return 0;
        array[level] = root.val;
        int temp = 0;
        int n = 0;
        for (int i=level; i>=0; i--) {
            temp += array[i];
            if (temp == sum) n++;
        }
        int left = helper(root.left, sum, array, level + 1);
        int right = helper(root.right, sum, array, level + 1);
        return n + left + right;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        TreeNode root1 = TreeNode.createTree("[10,5,-3,3,2,null,11,3,-2,null,1]");
        int result1 = s.pathSum(root1, 8);
        System.out.println(result1);
    }
}
