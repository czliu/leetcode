// 0560. subarray sum equals k
// #medium
// *

package _0560;

public class Solution {
    
    public int subarraySum(int[] nums, int k) {
        // sum(i,j)=sum(0,j)-sum(0,i), where sum(i,j) represents the sum of all the elements from index i to j-1
        int n = nums.length;
        if (n == 0) return 0;
        int[] sum = new int[n]; // sum[i] means sum of index 0 to i
        for (int i=0;i<n;++i) {
            if (i == 0) sum[i] = nums[0];
            else sum[i] = sum[i-1] + nums[i];
        }
        int ans = 0;
        for (int i=0;i<n;++i){
            for (int j=i;j<n;++j){
                if (i == 0 && sum[j] == k) ++ans;
                else if (i >= 1 && sum[j] - sum[i-1] == k) ++ans;
            }
        }
        return ans;
    }
}