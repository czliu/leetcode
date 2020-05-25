// 0717.1比特与2比特字符
// #easy
// -

package _0717;

public class Solution {

    public boolean isOneBitCharacter(int[] bits) {
        int n = bits.length;
        int i = 0, k = 0;
        while (i < n) {
            if (bits[i] == 1) {
                i += 2;
                k = 2;
            }
            else {
                ++i;
                k = 1;
            }
        }
        return (k == 1)? true : false;
    }
    
}