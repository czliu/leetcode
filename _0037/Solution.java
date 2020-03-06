// 0037. Sudoku Solver
// 回溯法， 递归
// 复习

package _0037;

// import java.util.*;

class Solution {
    public void solveSudoku(char[][] board) {
        if (board == null || board.length != 9 || board[0].length != 9) return;
        // 三个布尔数组 表明 行, 列, 还有 3*3 的方格的数字是否被使用过
        boolean[][] row = new boolean[9][9], col = new boolean[9][9], box = new boolean[9][9];
        // 初始化
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') continue;
                int num = board[i][j] - '1'; // num 取值范围0~8
                // k: sub-box index
                int k = (i / 3) * 3 + j / 3;
                row[i][num] = col[j][num] = box[k][num] = true;
            }
        }
        // 递归尝试填充数组 
        solveSudokuHelper(board, 0, row, col, box);
    }

    boolean solveSudokuHelper(char[][] board, int n, boolean[][] row, boolean[][] col, boolean[][] box) {
        // 边界校验, 如果已经填充完成, 返回true, 表示一切结束
        if (n == 81) return true;
        int i = n / 9, j = n % 9;
        // 是空则尝试填充, 否则跳过继续尝试填充下一个位置
        if (board[i][j] != '.') return solveSudokuHelper(board, n + 1, row, col, box);
        // k: sub-box index
        int k = (i / 3) * 3 + j / 3;
        for (int num = 0; num < 9; num++) {
            if (row[i][num] || col[j][num] || box[k][num]) continue;
            board[i][j] = (char) (num + '1');
            row[i][num] = col[j][num] = box[k][num] = true;
            if (solveSudokuHelper(board, n + 1, row, col, box)) return true;
            row[i][num] = col[j][num] = box[k][num] = false;
        }
        board[i][j] = '.';
        return false;
    }

    public static void main(String[] args) {
    }
}