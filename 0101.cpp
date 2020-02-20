// 101. Symmetric Tree

// Binary Tree

#include <iostream>
using namespace std;

// Definition for a binary tree node.
struct TreeNode {
    int val;
    TreeNode *left;
    TreeNode *right;
    TreeNode(int x) : val(x), left(NULL), right(NULL) {}
};

class Solution {
public:
    bool isSymmetric(TreeNode* root) {
        return isMirror(root, root);
    }

    bool isMirror(TreeNode* p, TreeNode* q){
        if (p == NULL && q == NULL) return true;
        else if (p == NULL || q == NULL) return false;
        else return (p->val == q->val) && isMirror(p->left, q->right) && isMirror(p->right, q->left);
    }
};

int main(){
    TreeNode *p = new TreeNode(1);
    p->left = new TreeNode(2);
    p->right = new TreeNode(2);
    p->left->right = new TreeNode(3);
    p->right->left = new TreeNode(3);
    Solution s;
    cout << s.isSymmetric(p);
}