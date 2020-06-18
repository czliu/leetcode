// 1342. 将数字变成 0 的操作次数
// #easy
// -

package _1342;

class Solution {
    public int numberOfSteps (int num) {
        int steps = 0;
        while (num > 0) {
            ++steps;
            if (num % 2 == 0) num = num / 2;
            else --num;
        }
        return steps;
    }
}
