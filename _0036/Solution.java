// 0036. Valid Sudoku
// Hashmap

package _0036;

import java.util.*;

class Solution {
    public boolean isValidSudoku(char[][] board) {
        if (board == null || board.length != 9 || board[0].length != 9) return false;
        HashMap<Character,Integer> map = new HashMap<>();
        // check each row
        for (int i=0;i<9;i++) {
            map.clear();
            for (int j=0;j<9;j++) {
                if (map.containsKey(board[i][j])) return false;
                else if (board[i][j] != '.') map.put(board[i][j], 1);
            }
        }
        // check each column
        for (int j=0;j<9;j++) {
            map.clear();
            for (int i=0;i<9;i++) {
                if (map.containsKey(board[i][j])) return false;
                else if (board[i][j] != '.') map.put(board[i][j], 1);
            }
        }
        // check each 3*3 sub-boxes
        // 9 sub-boxes with index x
        // within 1 sub-boxes, index y
        for (int x=0;x<9;x++) {
            map.clear();
            for (int y=0;y<9;y++) {
                int i = (x % 3) * 3 + y % 3;
                int j = (x / 3) * 3 + y / 3;
                if (map.containsKey(board[i][j])) return false;
                else if (board[i][j] != '.') map.put(board[i][j], 1);
            }
        }
        return true;
    }

    public static void main(String[] args) {
    }
}
