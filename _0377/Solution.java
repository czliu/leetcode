package _0377;


// Time limit exceeded
// public class Solution {
//     public int combinationSum4(int[] nums, int target) {
//         int ans = 0;
//         int len = nums.length;
//         for (int i=0;i<len;++i) {
//             if (nums[i] == target) ans += 1;
//             else if (nums[i] < target) {
//                 ans += combinationSum4(nums, target-nums[i]);
//             }
//         }
//         return ans;
//     }
// }

// Time limit exceeded
// public class Solution {
//     public int combinationSum4(int[] nums, int target) {
//         int[] tmp = new int[target+1];
//         return recurse(nums, target, tmp);
//     }

//     public int recurse(int[] nums, int remain, int[] tmp) {
//         int len = nums.length;
//         if (remain < 0) return 0;
//         if (tmp[remain] != 0) return tmp[remain];
//         if (remain == 0) return 1;
//         int ans = 0;
//         for (int i=0;i<len;++i) {
//             ans += recurse(nums, remain-nums[i], tmp);
//         }
//         tmp[remain] = ans;
//         return ans;
//     }
// }

public class Solution {
    public int combinationSum4(int[] nums, int target) {
        int[] tmp = new int[target+1];
        for (int i=0;i<target+1;++i) tmp[i] = -1;
        return recurse(nums, target, tmp);
    }

    public int recurse(int[] nums, int remain, int[] tmp) {
        int len = nums.length;
        if (remain < 0) return 0;
        if (tmp[remain] != -1) return tmp[remain];
        if (remain == 0) return 1;
        int ans = 0;
        for (int i=0;i<len;++i) {
            ans += recurse(nums, remain-nums[i], tmp);
        }
        tmp[remain] = ans;
        return ans;
    }
}
