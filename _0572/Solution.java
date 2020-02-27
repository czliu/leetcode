// 0572. Subtree of Another Tree
// BT 二叉树

package _0572;

// import java.util.*;

import structure.TreeNode;

class Solution {

    boolean ans = false;

    public boolean isSubtree(TreeNode s, TreeNode t) {
        traverse(s, t);
        return ans;
    }

    private void traverse(TreeNode s, TreeNode t) {
        if (ans == true) return;
        if (equals(s,t)) {
            ans = true;
            return;
        };
        if (s.left != null) traverse(s.left, t);
        if (s.right != null) traverse(s.right, t);
        return;
    }

    private boolean equals(TreeNode s, TreeNode t) {
        if (s == null && t == null) return true;
        else if (s == null || t == null) return false;
        else if (s.val != t.val) return false;
        else return equals(s.left, t.left) && equals(s.right, t.right);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        TreeNode root1 = TreeNode.createTree("[3,4,5,1,2,null,null,null,null,0]");
        TreeNode root2 = TreeNode.createTree("[4,1,2]");
        boolean result1 = s.isSubtree(root1, root2);
        System.out.println(result1);
        TreeNode root3 = TreeNode.createTree("[3,4,5,1,2]");
        TreeNode root4 = TreeNode.createTree("[4,1,2]");
        boolean result2 = s.isSubtree(root3, root4);
        System.out.println(result2);
    }
}
