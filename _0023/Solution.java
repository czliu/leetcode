// 0023. Merge k sorted lists

// Linked List

package _0023;

import structure.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class Solution {

    public ListNode mergeKLists(ListNode[] lists) {
        return merge(lists, 0, lists.length - 1);
    }

    private ListNode merge(ListNode[] lists, int l, int r) {
        if (l == r) return lists[l];
        if (l > r) return null;
        int mid = l + (r - l) / 2;
        return mergeTwoLists(merge(lists, l, mid), merge(lists, mid + 1, r));
    }

    private ListNode mergeTwoLists(ListNode a, ListNode b){
        if (a == null) return b;
        if (b == null) return a;
        ListNode head = new ListNode(0);
        ListNode cur = head;
        while (a != null && b != null){
            if (a.val > b.val) {
                cur.next = b;
                b = b.next;
            }
            else {
                cur.next = a;
                a = a.next;
            }
            cur = cur.next;
        }
        cur.next = (a == null)? b : a;
        return head.next;
    }
}