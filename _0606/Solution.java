// 0606. Construct String from Binary Tree
// BT 二叉树, recursion 递归

package _0606;

// import java.util.*;

import structure.TreeNode;

class Solution {

    public String tree2str(TreeNode t) {
        if (t == null) return "";
        else if (t.left == null && t.right == null) return t.val + "";
        else if (t.right == null) return t.val + "(" + tree2str(t.left) + ")";
        else return t.val + "(" + tree2str(t.left) + ")(" + tree2str(t.right)+ ")";
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        TreeNode root1 = TreeNode.createTree("[1,2,3,null,4]");
        String result1 = s.tree2str(root1);
        System.out.println(result1);
    }
}
