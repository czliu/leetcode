// 0605. 种花问题
// #easy
// -

package _0605;

public class Solution {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int cur = 0;
        int i = 0;
        int len = flowerbed.length;
        if (len == 0)
            return false;
        while (i < len) {
            if (flowerbed[i] == 0) {
                if (i == 0 && i + 1 < len && flowerbed[i + 1] == 0) {
                    flowerbed[i] = 1;
                    ++cur;
                    i += 2;
                } else if (i - 1 >= 0 && i + 1 < len && flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
                    flowerbed[i] = 1;
                    ++cur;
                    i += 2; 
                } else if (i == len - 1 && i - 1 >= 0 && flowerbed[i - 1] == 0) {
                    flowerbed[i] = 1;
                    ++cur;
                    ++i;
                } else if (len == 1) {
                    flowerbed[i] = 1;
                    ++cur;
                    ++i;
                } else ++i;
            } else i += 2;
            if (cur >= n) return true;
        }
        return false;
    }

}