// 1237. 找出给定方程的正整数解
// #easy
// -

package _1237;

/*
 * // This is the custom function interface.
 * // You should not implement it, or speculate about its implementation
 * class CustomFunction {
 *     // Returns f(x, y) for any given positive integers x and y.
 *     // Note that f(x, y) is increasing with respect to both x and y.
 *     // i.e. f(x, y) < f(x + 1, y), f(x, y) < f(x, y + 1)
 *     public int f(int x, int y);
 * };
 */

//import java.util.LinkedList;
//import java.util.List;

//class Solution {
//    public List<List<Integer>> findSolution(CustomFunction customfunction, int z) {
//        List<List<Integer>> list = new LinkedList<>();
//        int rightlimit = 1000;
//        for (int x=1;x<=1000;++x) {
//            if (customfunction.f(x, 1) > z) break;
//            int left = 1, right = rightlimit;
//            while (left <= right) {
//                int mid = (left + right) / 2;
//                if (customfunction.f(x, mid) > z) {
//                    right = mid - 1;
//                    rightlimit = right;
//                } else if (customfunction.f(x, mid) < z) left = mid + 1;
//                else {
//                    List<Integer> cur = new LinkedList<>();
//                    cur.add(x);
//                    cur.add(mid);
//                    list.add(cur);
//                    rightlimit = mid;
//                    break;
//                }
//            }
//        }
//        return list;
//    }
//}
