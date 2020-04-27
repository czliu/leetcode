// 0189. rotate array

// #easy #review #inPlace

package _0189;

public class Solution {

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int count = 0;
        for (int i = 0; count < n; ++i){
            int cur = i;
            int pre = nums[i];
            do {
                int next = (cur + k) % n;
                int tmp = nums[next];
                nums[next] = pre;
                pre = tmp;
                cur = next;
                ++count;
            } while (i != cur);
        }
    }
}