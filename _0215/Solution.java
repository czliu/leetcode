// 215. 数组中的第K个最大元素
// #medium
// *

package _0215;

import java.util.PriorityQueue;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        final PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int val : nums) {
            queue.add(val);
            if (queue.size() > k)
                queue.poll();
        }
        return queue.peek();
    }
}

class Solution2 {
    public int findKthLargest(int[] nums, int k) {
        k = nums.length - k;//注意这里的k已经变了
        int lo = 0, hi = nums.length - 1;
        while (lo <= hi) {
            int i = lo;
            //这里把数组以A[lo]的大小分为两部分，
            //一部分是小于A[lo]的，一部分是大于A[lo]的
            // [lo,i]<A[lo]，[i+1,j)>=A[lo]
            for (int j = lo + 1; j <= hi; j++)
                if (nums[j] < nums[lo])
                    swap(nums, j, ++i);
            swap(nums, lo, i);
            if (k == i)
                return nums[i];
            else if (k < i)
                hi = i - 1;
            else
                lo = i + 1;
        }
        return -1;
    }

    private void swap(int[] nums, int i, int j) {
        if (i != j) {
            nums[i] ^= nums[j];
            nums[j] ^= nums[i];
            nums[i] ^= nums[j];
        }
    }
}