// 0042. Trapping Rain Water

package _0042;

class Solution {
    public int trap(int[] height) {
        if (height == null) return 0;
        int n = height.length;
        if (n <= 1) return 0;
        int maxLeft[] = new int[n];
        int maxRight[] = new int[n];
        int max = height[0];
        for (int i=0;i<n;++i){
            max = (height[i] > max)? height[i] : max;
            maxLeft[i] = max;
        }
        max = height[n-1];
        for (int i=n-1;i>=0;--i){
            max = (height[i] > max)? height[i] : max;
            maxRight[i] = max;
        }
        int ans = 0;
        for (int i=0;i<n;++i){
            ans += Math.min(maxLeft[i], maxRight[i]) - height[i];
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}