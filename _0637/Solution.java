// 0637. Average of Levels in Binary Tree
// BT 二叉树

package _0637;

import java.util.*;

import structure.TreeNode;

class Solution {

    public List<Double> averageOfLevels(TreeNode root) {
        LinkedList<TreeNode> nodeStack = new LinkedList<>();
        List<Double> average = new LinkedList<>();
        if (root == null) return average;
        nodeStack.add(root);
        while (!nodeStack.isEmpty()) {
            LinkedList<TreeNode> temp = new LinkedList<>();
            double sum = 0;
            double count = 0;
            for (TreeNode item : nodeStack) {
                sum += item.val;
                count += 1;
                if (item.left != null) temp.add(item.left);
                if (item.right != null) temp.add(item.right);
            }
            nodeStack = temp;
            average.add(sum/count);
        }
        return average;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        TreeNode root1 = TreeNode.createTree("[3,9,20,null,null,15,7]");
        List<Double> result1 = s.averageOfLevels(root1);
        System.out.println(result1);
        // TreeNode.printPreOrder(result1);
    }
}
