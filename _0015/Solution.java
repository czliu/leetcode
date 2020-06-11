// 0015. 3Sum
// #medium
// *

package _0015;

import java.util.*;

// #双指针，剪枝，去重
// 超出时间限制
class Solution {

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        if (nums.length < 3) return list;
        for (int i=0;i<nums.length-2;i++) {
            int left = i+1;
            int right = nums.length-1;
            while (left < right) {
                int sum = nums[i]+nums[left]+nums[right];
                if (sum == 0) {
                    list.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    right--;
                }
                else if (sum < 0) left++;
                else right--;
            }
        }
        // 去重
        HashMap<List<Integer>,Integer> map = new HashMap<>();
        for (int i=0;i<=list.size()-1;i++) {
            map.put(list.get(i),1);
        }
        list.clear();
        for (List<Integer> item : map.keySet()) list.add(item);
        return list;
    }

    public static void main(String[] args) {
    }
}

class Solution2 {

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();
        List<List<Integer>> ans = new LinkedList<>();
        if (nums.length < 3) return ans;
        for (int i=0;i<nums.length-2;i++) {
            int left = i+1;
            int right = nums.length-1;
            while (left < right) {
                int sum = nums[i]+nums[left]+nums[right];
                if (sum == 0) {
                    set.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    right--;
                }
                else if (sum < 0) left++;
                else right--;
            }
        }
        for (List<Integer> item : set) ans.add(item);
        return ans;
    }

    public static void main(String[] args) {
    }
}

