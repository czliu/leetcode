package _0202;

import java.util.*;

public class Solution2 {
    public boolean isHappy(int n) {
        Set<Integer> s = new HashSet<>();
        while (!s.contains(n)) {
            s.add(n);
            n = sumOfSquares(n);
        }
        if (n == 1) return true;
        else return false;
    }

    public int sumOfSquares(int n) {
        int sum = 0;
        while (n > 0) {
            sum += Math.pow(n % 10, 2);
            n = n/10;
        }
        return sum;
    }
}
