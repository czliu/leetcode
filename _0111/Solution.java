// 0111. Minimum Depth of Binary Tree
// BST

package _0111;

// import java.util.*;

import structure.TreeNode;

class Solution {
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        else if (root.left == null && root.right == null) return 1;
        else if (root.left == null) return minDepth(root.right) + 1;
        else if (root.right == null) return minDepth(root.left) + 1;
        return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        TreeNode root1 = TreeNode.createTree("[3,9,20,null,null,15,7]");
        int result1 = s.minDepth(root1);
        System.out.println(result1);
        TreeNode root2 = TreeNode.createTree("[1,2]");
        int result2 = s.minDepth(root2);
        System.out.println(result2);
    }
}
