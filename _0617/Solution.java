// 0617. Merge Two Binary Trees
// BT 二叉树, recursion 递归

package _0617;

// import java.util.*;

import structure.TreeNode;

class Solution {

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) return null;
        else if (t1 == null) return t2;
        else if (t2 == null) return t1;
        TreeNode node = new TreeNode(t1.val + t2.val);
        node.left = mergeTrees(t1.left, t2.left);
        node.right = mergeTrees(t1.right, t2.right);
        return node;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        TreeNode root1 = TreeNode.createTree("[1,3,2,5]");
        TreeNode root2 = TreeNode.createTree("[2,1,3,null,4,null,7]");
        TreeNode result1 = s.mergeTrees(root1, root2);
        // System.out.println(result1);
        TreeNode.printPreOrder(result1);
    }
}
