// 148. Sort List 
// singly linked list, bottem-up mergesort

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
    ListNode* sortList(ListNode* head) {
        // get the size of list
        ListNode* curr = head;
        int n = 0;
        while (curr) {
            curr = curr->next;
            n++;
        }
        // bottom-up mergesort
        ListNode* dummyHead = new ListNode(0);
        dummyHead->next = head;
        for (int size=1; size<n; size = size*2){
            curr = dummyHead->next;
            ListNode* tail = dummyHead;
            while (curr) {
                ListNode* left = curr;
                ListNode* right = cut(left, size);
                curr = cut(right, size);
                tail->next = merge(left, right);
                while (tail->next) {
                    tail = tail->next;
                }
            }
        }
        return dummyHead->next;
    }

    // cut the first i elements of a singly linked list
    // then return the head of the remaining part 
    ListNode* cut(ListNode* head, int i){
        ListNode* l1Tail = head;
        while (--i && l1Tail){
            l1Tail = l1Tail->next;
        }
        if (!l1Tail) return nullptr;
        ListNode* l2 = l1Tail->next;
        l1Tail->next = nullptr;
        return l2;
    }

    // merge 2 sorted singly linked list l1 and l2
    ListNode* merge(ListNode* l1, ListNode* l2){
        ListNode* temp = new ListNode(0);
        ListNode* dummyHead = new ListNode(0);
        temp = dummyHead;
        while (l1 && l2){
            if (l1->val < l2->val) {
                temp->next = l1;
                temp = l1;
                l1 = l1->next;
            } else {
                temp->next = l2;
                temp = l2;
                l2 = l2->next;
            }
        }
        if (l1 == NULL) temp->next = l2;
        else if (l2 == NULL) temp->next = l1;
        return dummyHead->next;
    }
};

int main(void){
    Solution s;
    ListNode *a1 = new ListNode(-1);
    ListNode *a2 = new ListNode(5);
    ListNode *a3 = new ListNode(3);
    ListNode *a4 = new ListNode(4);
    ListNode *a5 = new ListNode(0);
    a1->next=a2;
    a2->next=a3;
    a3->next=a4;
    a4->next=a5;
    a5->next=NULL;
    ListNode *head = s.sortList(a1);
    while (head != nullptr){
        cout << head->val << " ";
        head = head->next;
    }
    return 0;
}