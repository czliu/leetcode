package _1502;

import java.util.*;

public class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        if (arr.length == 1) return true;
        int diff = arr[1] - arr[0];
        for (int i=1;i<arr.length;++i) {
            if (arr[i] - arr[i-1] != diff) return false;
        }
        return true;
    }
}
