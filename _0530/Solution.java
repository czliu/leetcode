// 0530. Minimum Absolute Difference in BST
// BST 二叉搜索树

package _0530;

// import java.util.*;

import structure.TreeNode;

class Solution {

    // // Use a LinkedList to store the BST, cost extra space
    // List<Integer> list = new LinkedList<>();
    // int result;

    // public int getMinimumDifference(TreeNode root) {
    //     if (root == null) return -1; // There are at least two nodes in this BST, so this won't happen
    //     inOrder(root);
    //     result = Math.abs(list.get(0) - list.get(1));
    //     for(int i=1;i<=list.size()-1;i++) {
    //         int cur = Math.abs(list.get(i-1)-list.get(i));
    //         if(cur < result) result = cur;
    //     }
    //     return result;
    // }

    // private void inOrder(TreeNode node) {
    //     if (node == null) return;
    //     inOrder(node.left);
    //     list.add(node.val);
    //     inOrder(node.right);
    // }

    int pre = -1; // This BST only has non-negative values
    int min = Integer.MAX_VALUE;

    public int getMinimumDifference(TreeNode root) {
        if (root == null) return -1; // There are at least two nodes in this BST, so this won't happen
        inOrder(root);
        return min;
    }

    private void inOrder(TreeNode node) {
        if (node == null) return;
        inOrder(node.left);
        if (pre == -1) pre = node.val;
        else {
            int cur = Math.abs(pre - node.val); // current absolute difference
            if (cur < min) min = cur;
            pre = node.val;
        }
        inOrder(node.right);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        TreeNode root1 = TreeNode.createTree("[1,null,5,null,null,2]");
        int result1 = s.getMinimumDifference(root1);
        System.out.println(result1);
    }
}
