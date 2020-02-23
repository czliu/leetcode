package structure;

// Definition for a binary tree node.
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(int x) { val = x; }

    public static TreeNode createTree(String data) {
        if (data.equals("[]")) return null;
        data = data.substring(1, data.length() - 1);
        String[] split = data.split(",");
        int len = split.length;
        TreeNode[] treeNodes = new TreeNode[len];
        data = data.substring(1, data.length() - 1);
        for (int i = 0; i < len; i++) {
            if (!split[i].equals("null")) {
                treeNodes[i] = new TreeNode(Integer.valueOf(split[i]));
            }
        }
        for (int i = 0; i < len; i++) {
            if (treeNodes[i] != null) {
                int leftIndex = i * 2 + 1;
                if (leftIndex < len) {
                    treeNodes[i].left = treeNodes[leftIndex];
                }
                int rightIndex = leftIndex + 1;
                if (rightIndex < len) {
                    treeNodes[i].right = treeNodes[rightIndex];
                }
            }
        }
        return treeNodes[0];
    }

    // print the tree in DFS PreOrder
    public static void printPreOrder(TreeNode root) {
        if (root == null) return;
        System.out.println(root.val);
        printPreOrder(root.left);
        printPreOrder(root.right);
    }

    // print the tree in DFS InOrder
    public static void printInOrder(TreeNode root) {
        if (root == null) return;
        printInOrder(root.left);
        System.out.println(root.val);
        printInOrder(root.right);
    }

    // print the tree in DFS PostOrder
    public static void printPostOrder(TreeNode root) {
        if (root == null) return;
        printPostOrder(root.left);
        printPostOrder(root.right);
        System.out.println(root.val);
    }
}