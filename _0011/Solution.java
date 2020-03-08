// 0011. Container With Most Water
// 双指针

package _0011;

// import java.util.*;

class Solution {
    public int maxArea(int[] height) {
        int maxarea = 0, l = 0, r = height.length - 1;
        while (l < r) {
            maxarea = Math.max(maxarea, Math.min(height[l], height[r]) * (r - l));
            if (height[l] < height[r])
                l++;
            else
                r--;
        }
        return maxarea;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(s.maxArea(height));
        int[] height2 = {1,1};
        System.out.println(s.maxArea(height2));
    }
}