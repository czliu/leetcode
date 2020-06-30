// 54. 螺旋矩阵
// #medium
// -

package _0054;

import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new LinkedList<>();
        if (matrix.length == 0 || matrix[0].length == 0) return list;
        int top = 0, bottom = matrix.length-1;
        int left = 0, right = matrix[0].length-1;
        int totalNum = matrix.length * matrix[0].length;
        int[] dir0 = new int[] {0,1, 0,-1};
        int[] dir1 = new int[] {1,0,-1, 0};
        int count = 0, dirIndex = 0;
        int[] cur = new int[] {0,0};
        list.add(matrix[cur[0]][cur[1]]);
        ++top;
        ++count;
        while (count < totalNum) {
            if (dirIndex == 0 && cur[1] + dir1[dirIndex] > right) {
                ++dirIndex;
                --right;
                continue;
            }
            else if (dirIndex == 1 && cur[0] + dir0[dirIndex] > bottom) {
                ++dirIndex;
                --bottom;
                continue;
            }
            else if (dirIndex == 2 && cur[1] + dir1[dirIndex] < left) {
                ++dirIndex;
                ++left;
                continue;
            }
            else if (dirIndex == 3 && cur[0] + dir0[dirIndex] < top) {
                dirIndex = 0;
                ++top;
                continue;
            }
            cur[0] += dir0[dirIndex];
            cur[1] += dir1[dirIndex];
            list.add(matrix[cur[0]][cur[1]]);
            ++count;
        }
        return list;
    }

}