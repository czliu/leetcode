// 0202. Happy Number
// Hashset

package _0202;

import java.util.*;

class Solution {

    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while (!set.contains(sumOfSquare(n))) {
            n = sumOfSquare(n);
            set.add(n);
        }
        if (set.contains(1)) return true;
        else return false;
    }

    private int sumOfSquare(int n) {
        int sum = 0;
        while (n != 0) {
            sum += Math.pow(n%10, 2);
            n = n/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int n = 19;
        boolean result1 = s.isHappy(n);
        System.out.println(result1);
    }
}
