package _0191;

public class Solution2 {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
        if(n < 0){
            n = n ^ (1 << 31);
            count++;
        }
        while(n != 0){
            count += n % 2;
            n = n >> 1;
        }
        return count;
    }
}
