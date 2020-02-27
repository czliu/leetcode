// 0563. Binary Tree Tilt
// BT 二叉树

package _0563;

// import java.util.*;

import structure.TreeNode;

class Solution {

    int tilt = 0;

    public int findTilt(TreeNode root) {
        sum(root);
        return tilt;
    }

    private int sum(TreeNode node) {
        if (node == null) return 0;
        int l = sum(node.left);
        int r = sum(node.right);
        tilt += Math.abs(l - r);
        return l + r + node.val;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        TreeNode root1 = TreeNode.createTree("[1,2,3]");
        int result1 = s.findTilt(root1);
        System.out.println(result1);
    }
}
