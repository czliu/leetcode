// 0404. Sum of Left Leaves
// BT 二叉树

package _0404;

// import java.util.*;

import structure.TreeNode;

class Solution {

    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return 0;
        if (root.left != null && root.left.left == null && root.left.right == null) return root.left.val + sumOfLeftLeaves(root.right);
        else return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        TreeNode root1 = TreeNode.createTree("[3,9,20,null,null,15,7]");
        int result1 = s.sumOfLeftLeaves(root1);
        System.out.println(result1);
    }
}
