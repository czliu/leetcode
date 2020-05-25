// 0287. 寻找重复数
// #medium
// *
// related: 142

package _0287;

class Solution {

    // 快慢指针, 「Floyd 判圈算法」（又称龟兔赛跑算法）
    public int findDuplicate(int[] nums) {
        int slow = 0, fast = 0;
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);
        slow = 0;
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}
