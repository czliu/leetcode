// 面试题29. 顺时针打印矩阵
// #easy
// -

package interview29;

class Solution {
    public int[] spiralOrder(int[][] matrix) {
        int row = matrix.length;
        if (row == 0) return new int[0];
        int col = matrix[0].length;
        if (col == 0) return new int[0];
        int[] ans = new int[row * col];
        int left = 0, right = col-1;
        int top = 0, bottom = row-1;
        int count = 0;
        int curr = 0, curc = -1;
        int dir = 1; // direction: 1right, 2down, 3left, 4up
        do {
            if (dir == 1) {
                if (curc < right) ++curc;
                else if (curc == right && curr < bottom) {
                    dir = 2;
                    ++curr;
                    ++top;
                } else if (curc == right && curr == bottom) break;
            } else if (dir == 2) {
                if (curr < bottom) ++curr;
                else if (curr == bottom && curc > left) {
                    dir = 3;
                    --curc;
                    --right;
                } else if (curr == bottom && curc == left) break;
            } else if (dir == 3) {
                if (curc > left) --curc;
                else if (curc == left && curr > top) {
                    dir = 4;
                    --curr;
                    --bottom;
                } else if (curc == left && curr == bottom) break;
            } else if (dir == 4) {
                if (curr > top) --curr;
                else if (curr == top && curc < right) {
                    dir = 1;
                    ++curc;
                    ++left;
                } else if (curr == top && curc == right) break;
            }
            ans[count-1] = matrix[curr][curc];
            ++count;
        } while (count < row * col);
        return ans;
    }
}