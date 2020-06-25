// 面试题 02.01. 移除重复节点
// #easy
// -

package interview02_01;

import structure.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeDuplicateNodes(ListNode head) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode cur = head;
        ListNode pre = head;
        Set<Integer> set = new HashSet<>();
        while (cur != null) {
            if (!set.contains(cur.val)) {
                set.add(cur.val);
                pre = cur;
                cur = cur.next;
            }
            else {
                pre.next = cur.next;
                cur = cur.next;
            }
        }
        return dummyHead.next;
    }
}