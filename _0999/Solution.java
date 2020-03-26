// 0999. Available captures for rook

package _0999;

// import java.util.*;

class Solution {

    public int numRookCaptures(char[][] board) {
        int m=0,n=0;
        outer: for (int i=0;i<8;++i) {
            for (int j=0;j<8;++j) {
                if (board[i][j] == 'R') {
                    m = i;
                    n = j;
                    break outer;
                }
            }
        }
        int ans = 0;
        if (n != 0) {
            for (int k=n-1;k>=0;--k) {
                if (board[m][k] == 'p') {
                    ++ans;
                    break;
                }
                else if (board[m][k] == 'B') break;
            }
        }
        if (n != 7) {
            for (int k=n+1;k<=7;++k) {
                if (board[m][k] == 'p') {
                    ++ans;
                    break;
                }
                else if (board[m][k] == 'B') break;
            }
        }
        if (m != 0) {
            for (int k=m-1;k>=0;--k) {
                if (board[k][n] == 'p') {
                    ++ans;
                    break;
                }
                else if (board[k][n] == 'B') break;
            }
        }
        if (m != 7) {
            for (int k=m+1;k<=7;++k) {
                if (board[k][n] == 'p') {
                    ++ans;
                    break;
                }
                else if (board[k][n] == 'B') break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
    }
}
