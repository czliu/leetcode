// 面试题64. 求1+2+…+n
// #medium
// *

package interview64;

class Solution {
    // 通常实现递归的时候我们都会利用条件判断语句来决定递归的出口，但由于题目的限制我们不能使用条件判断语句，那么我们是否能使用别的办法来确定递归出口呢？答案就是逻辑运算符的短路性质。
    // public int sumNums(int n) {
    //     boolean flag = n > 0 && (n += sumNums(n - 1)) > 0;
    //     return n;
    // }
}
