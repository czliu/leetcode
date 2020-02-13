// 147. Insertion Sort List 
// singly linked list, recursion

#include <iostream>
using namespace std; 

// Definition for singly-linked list.
struct ListNode {
    int val;
    ListNode *next;
    ListNode(int x) : val(x), next(NULL) {}
};

class Solution {
public:
    ListNode* insertionSortList(ListNode* head) {
        if (head==NULL) return NULL;
        ListNode* i = head;
        ListNode* j = insertionSortList(head->next);
        if (j==NULL || i->val <= j->val){
            i->next = j;
            return i;
        } else {
            ListNode* prev = j;
            ListNode* curr = j->next;
            while (curr != NULL && curr->val < i->val) {
                prev = curr;
                curr = curr->next;
            }
            prev->next = i;
            i->next = curr;
            return j;
        }
    }
};

int main(void) {
    Solution s;
    ListNode *a1 = new ListNode(4);
    ListNode *a2 = new ListNode(2);
    ListNode *a3 = new ListNode(1);;
    ListNode *a4 = new ListNode(3);;
    a1->next=a2;
    a2->next=a3;
    a3->next=a4;
    a4->next=NULL;
    ListNode *head = s.insertionSortList(a1);
    while (head != nullptr){
        cout << head->val << " ";
        head = head->next;
    }
    return 0;
}
