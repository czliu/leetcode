// 0628. 三个数的最大乘积
// #easy
// *

package _0628;

public class Solution {

    //最终的选择存在以下四种情况： 
    //1.三个数字全部为整数，结果肯定为最大的三个正数的积； 
    //2.三个数字有两个为正数，这种情况结果为负数，说明只有两个正数，且负数的数量也不可能多于一个，可以证明此时只有三个数字，可以认为是选择最大的三个数； 
    //3.三个数字中有一个为正数，这时，我们很显然会选择两个最小的负数和一个最大的正数； 
    //4.三个数字全部为负数，这种情况下，所有数字都为负数，我们显然选择最大的三个数。
    //min1 < min2 < max3 < max2 < max1
    public int maximumProduct(int[] nums) {
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;
        for (int n: nums) {
            if (n <= min1) {
                min2 = min1;
                min1 = n;
            } else if (n <= min2) {     // n lies between min1 and min2
                min2 = n;
            }
            if (n >= max1) {            // n is greater than max1, max2 and max3
                max3 = max2;
                max2 = max1;
                max1 = n;
            } else if (n >= max2) {     // n lies betweeen max1 and max2
                max3 = max2;
                max2 = n;
            } else if (n >= max3) {     // n lies betwen max2 and max3
                max3 = n;
            }
        }
        return Math.max(min1 * min2 * max1, max1 * max2 * max3);
    }
}
