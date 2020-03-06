// 1103. Distribute Candies to People
// 

package _1103;

// import java.util.*;

class Solution {

    public int[] distributeCandies(int candies, int num_people) {
        int pre = 0; // number of candies given to the previous people
        int i = 0; // index of people
        int[] output = new int[num_people]; // default initialization for int is 0
        while (candies > 0) {
            if (i>=num_people) i = 0;
            if (candies >= pre + 1) {
                candies -= (pre + 1);
                output[i++] += (pre + 1);
                pre ++;
            }
            else {   // candies < pre + 1
                output[i] += candies;
                candies = 0;
            }
        }
        return output;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] output = s.distributeCandies(7, 4);
        for (int i : output) System.out.println(i);
    }
}
