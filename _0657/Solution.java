// 0657. 机器人能否返回原点
// #easy
// -

package _0657;

public class Solution {

    public boolean judgeCircle(String moves) {
        int n = moves.length();
        if (n == 0) return true;
        int[] pos = new int[] {0,0};
        for (int i=0;i<n;++i) {
            updatePosition(moves.charAt(i), pos);
        }
        if (pos[0] == 0 && pos[1] == 0) return true;
        else return false;
    }

    private void updatePosition(char c, int[] pos) {
        if (c == 'R') ++pos[0];
        else if (c == 'L') --pos[0];
        else if (c == 'U') ++pos[1];
        else if (c == 'D') --pos[1];
    }
    
}