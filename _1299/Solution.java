// 1299. 将每个元素替换为右侧最大元素
// #easy
// -

package _1299;

class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int pre = arr[n-1];
        arr[n-1] = -1;
        for (int i=n-2;i>=0;--i) {
            int tmp = arr[i];
            arr[i] = pre;
            if (tmp > pre) {
                pre = tmp;
            }
        }
        return arr;
    }
}