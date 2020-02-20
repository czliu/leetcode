// 100. Same Tree

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
    bool isSameTree(TreeNode* p, TreeNode* q) {
        if (p == NULL && q == NULL) return true;
        else if (p == NULL || q == NULL || p->val != q->val) return false;
        else if (isSameTree(p->left, q->left) && isSameTree(p->right, q->right)) return true;
        else return false;
    }
};

int main(){
    TreeNode *p = new TreeNode(1);
    p->left = new TreeNode(2);
    TreeNode *q = new TreeNode(1);
    q->right = new TreeNode(2);
    Solution s;
    cout << s.isSameTree(p, q);
}