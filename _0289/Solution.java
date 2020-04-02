// 0289. Game of Life
// not in place

package _0289;

// import java.util.*;

class Solution {

    public void gameOfLife(int[][] board) {
        int[][] copyBoard = new int[board.length][board[0].length];
        for (int i=0;i<=board.length-1;++i){
            for (int j=0;j<=board[0].length-1;++j){
                copyBoard[i][j] = board[i][j];
            }
        }
        for (int i=0;i<=board.length-1;++i){
            for (int j=0;j<=board[0].length-1;++j){
                int sum = sumOfNeighbors(copyBoard, i, j);
                if (copyBoard[i][j] == 1){
                    if (sum < 2) board[i][j] = 0;
                    else if (sum == 2 || sum == 3) board[i][j] = 1;
                    else board[i][j] = 0;
                }
                else if (sum == 3) board[i][j] = 1;
                else board[i][j] = 0;
            }
        }
    }

    private int sumOfNeighbors(int[][] board, int i, int j){
        int[] x = {-1,0,+1,-1,+1,-1,0,+1};
        int[] y = {-1,-1,-1,0,0,+1,+1,+1};
        int sum = 0;
        for (int k=0;k<=7;++k){
            if (i+x[k] >= 0 && i+x[k] <= board.length-1 && j+y[k]>=0 && j+y[k] <= board[0].length-1){
                sum += board[i+x[k]][j+y[k]];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] board = {{0,1,0},{0,0,1},{1,1,1},{0,0,0}};
        s.gameOfLife(board);
    }
}
