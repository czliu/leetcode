// 0025. reverse nodes in k-group
// #hard #linkedlist
// *

package _0025;

import structure.ListNode;
import java.util.*;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode pre = dummyHead;
        while (head != null) {
            ListNode tail = pre;
            for (int i=0;i<k;++i){
                tail = tail.next;
                if (tail == null) return dummyHead.next;
            }
            ListNode n = tail.next;
            ArrayList<ListNode> list = reverse(head, tail);
            head = list.get(0);
            tail = list.get(1);
            pre.next = head;
            tail.next = n;
            pre = tail;
            head = tail.next;
        }
        return dummyHead.next;
    }

    private ArrayList<ListNode> reverse(ListNode head, ListNode tail) {
        ListNode pre = tail.next;
        ListNode h = head;
        while (pre != tail) {
            ListNode n = h.next;
            h.next = pre;
            pre = h;
            h = n;
        }
        ArrayList<ListNode> list = new ArrayList<>();
        list.add(tail);
        list.add(head);
        return list;
    }
}