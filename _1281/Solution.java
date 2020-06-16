// 1281. 整数的各位积和之差
// #easy
// -

package _1281;

class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0, multiply = 1;
        while (n > 0) {
            int digit = n % 10;
            n = n / 10;
            sum += digit;
            multiply *= digit;
        }
        return multiply - sum;
    }
}
