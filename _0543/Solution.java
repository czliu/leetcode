// 0543. Diameter of Binary Tree
// BT 二叉树

package _0543;

// import java.util.*;

import structure.TreeNode;

class Solution {

    int ans;

    public int diameterOfBinaryTree(TreeNode root) {
        ans = 0;
        depth(root);
        return ans;
    }

    private int depth(TreeNode node) {
        if (node == null) return 0;
        int l = depth(node.left);
        int r = depth(node.right);
        ans = Math.max(ans, l+r);
        return Math.max(l,r) + 1;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        TreeNode root1 = TreeNode.createTree("[1,2,3,4,5]");
        int result1 = s.diameterOfBinaryTree(root1);
        System.out.println(result1);
    }
}
