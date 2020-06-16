// 1290. 二进制链表转整数
// #easy
// -

package _1290;

import structure.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {
        int ans = 0;
        while (head != null) {
            ans *= 2;
            ans += head.val;
            head = head.next;
        }
        return ans;
    }
}