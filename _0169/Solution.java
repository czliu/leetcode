// 0169. Majority Element

package _0169;

import java.util.HashMap;

import java.util.*;

class Solution {

    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i:nums) {
            map.put(i, map.getOrDefault(i,0) + 1);
            if (map.get(i) > nums.length/2) return i;
        }
        return 0;
    }

    public static void main(String[] args) {
    }
}
