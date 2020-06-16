// 1275. 找出井字棋的获胜者
// #easy
// -

package _1275;

class Solution {
    public String tictactoe(int[][] moves) {
        int[][] board = new int[3][3];
        for (int i=0;i<moves.length;++i) {
            board[moves[i][0]][moves[i][1]] = (i % 2 == 0)? 1 : 10;
        }
        for (int i=0;i<3;++i) {
             int x = board[0][i] + board[1][i] + board[2][i];
             int y = board[i][0] + board[i][1] + board[i][2];
             if (x == 3 || y == 3) return "A";
             else if (x == 30 || y == 30) return "B";
        }
        int x = board[0][0] + board[1][1] + board[2][2];
        int y = board[2][0] + board[1][1] + board[0][2];
        if (x == 3 || y == 3) return "A";
        else if (x == 30 || y == 30) return "B";
        for (int i=0;i<3;++i) {
            for (int j=0;j<3;++j) {
                if (board[i][j] == 0) return "Pending";
            }
        }
        return "Draw";
    }
}
