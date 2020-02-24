// 0257. Binary Tree paths
// BT 二叉树, iteration 迭代

package _0257;

import java.util.*;

import structure.TreeNode;

class Solution {

    public List<String> binaryTreePaths(TreeNode root) {
        LinkedList<String> paths = new LinkedList<>();
        if (root == null) return paths;

        LinkedList<TreeNode> nodeStack = new LinkedList<>();
        LinkedList<String> pathStack = new LinkedList<>();
        nodeStack.add(root);
        pathStack.add(String.valueOf(root.val));
        TreeNode node;
        String path;
        while (!nodeStack.isEmpty()) {
            node = nodeStack.pollLast();
            path = pathStack.pollLast();
            if (node.left == null && node.right == null) paths.add(path);
            if (node.left != null) {
                nodeStack.add(node.left);
                pathStack.add(path + "->" + String.valueOf(node.left.val));
            }
            if (node.right != null) {
                nodeStack.add(node.right);
                pathStack.add(path + "->" + String.valueOf(node.right.val));
            }
        }
        return paths;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        TreeNode root1 = TreeNode.createTree("[1,2,3,null,5]");
        List<String> result1 = s.binaryTreePaths(root1);
        System.out.println(result1);
    }
}
