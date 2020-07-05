// 80. 删除排序数组中的重复项 II
// #medium
// *
// solution2 is better

package _0080;

class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;
        int toDelete = nums[0] - 1;
        int cur = nums[0];
        int count = 1, len = 1;
        for (int i=1;i<n;++i) {
            if (nums[i] == cur) {
                if (count == 1) {
                    ++count;
                    ++len;
                }
                else nums[i] = toDelete;
            }
            else {
                cur = nums[i];
                count = 1;
                ++len;
            }
        }
        int i = 0, j = 0;
        while (i < len) {
            if (nums[i] == toDelete) {
                while (nums[j] == toDelete) ++j;
                nums[i] = nums[j];
                nums[j] = toDelete;
            }
            else ++i;
        }
        return len;
    }
}

class Solution2 {

    // 时间复杂度：O(N)，我们遍历每个数组元素一次。
    // 空间复杂度：O(1)。
    public int removeDuplicates(int[] nums) {

        //
        // Initialize the counter and the second pointer.
        //
        int j = 1, count = 1;

        //
        // Start from the second element of the array and process
        // elements one by one.
        //
        for (int i = 1; i < nums.length; i++) {

            //
            // If the current element is a duplicate, increment the count.
            //
            if (nums[i] == nums[i - 1]) {

                count++;

            } else {

                //
                // Reset the count since we encountered a different element
                // than the previous one.
                //
                count = 1;
            }

            //
            // For a count <= 2, we copy the element over thus
            // overwriting the element at index "j" in the array
            //
            if (count <= 2) {
                nums[j++] = nums[i];
            }
        }
        return j;
    }
}
