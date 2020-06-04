// 860. 柠檬水找零
// #easy
// -

package _0860;

class Solution {
    public boolean lemonadeChange(int[] bills) {
        int[] own = new int[2];
        for (int i=0;i<bills.length;++i) {
            if (bills[i] == 5) {
                ++own[0];
            } else if (bills[i] == 10) {
                if (own[0] == 0) return false;
                else {
                    --own[0];
                    ++own[1];
                }
            } else if (bills[i] == 20) {
                if (own[1] > 0 && own[0] > 0) {
                    --own[0];
                    --own[1];
                } else if (own[0] >= 3) own[0] -= 3;
                else return false;
            }
        }
        return true;
    }
}