// 1356. 根据数字二进制下 1 的数目排序
// #easy
// *

package _1356;

import java.util.Arrays;

class Solution {
    public int[] sortByBits(int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = Integer.bitCount(arr[i]) * 10000000 + arr[i];
        }
        Arrays.sort(newArr);
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = newArr[i] % 10000000;
        }
        return newArr;
    }
}
