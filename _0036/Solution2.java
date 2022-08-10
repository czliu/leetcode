package _0036;

import java.util.*;

public class Solution2 {
    public boolean isValidSudoku(char[][] board) {
        if (board.length != 9 || board[0].length != 9) return false;

        Set<Character> s = new HashSet<>();

        for (int i=0;i<9;++i) {
            s.clear();
            for (int j=0;j<9;++j) {
                if (board[i][j] != '.' && s.contains(board[i][j])) return false;
                else if (board[i][j] != '.') s.add(board[i][j]);
            }
        }

        for (int j=0;j<9;++j) {
            s.clear();
            for (int i=0;i<9;++i) {
                if (board[i][j] != '.' && s.contains(board[i][j])) return false;
                else if (board[i][j] != '.') s.add(board[i][j]);
            }
        }

        for (int x=0;x<9;x++) {
            s.clear();
            for (int y=0;y<9;y++) {
                int i = (x % 3) * 3 + y % 3;
                int j = (x / 3) * 3 + y / 3;
                if (board[i][j] != '.' && s.contains(board[i][j])) return false;
                else if (board[i][j] != '.') s.add(board[i][j]);
            }
        }
        return true;
    }
}
