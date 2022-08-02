package _1523;

public class Solution {
    public int countOdds(int low, int high) {
        int count = 0;
        if (low % 2 == 1) {
            count = (high - low) / 2 + 1;
        }
        else {
            count = (high - low) / 2 + (high % 2);
        }
        return count;
    }
}
