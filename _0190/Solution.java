// 0190. reverse bits

// #easy #bit #review

package _0190;

public class Solution {

    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int power = 31;
        int reverse = 0;
        while (n != 0) {
            reverse += ((n & 1) << power);
            n = n >>> 1;
            // n = n >> 1; 会死循环, 注意区分>>和>>>的区别
            --power;
        }
        return reverse;  
    }
}