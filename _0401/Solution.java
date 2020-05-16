// 0401. binary watch
// #easy #backtrack
// *

package _0401;

import java.util.*;

public class Solution {

    List<String> list = new LinkedList<>();

    public List<String> readBinaryWatch(int num) {
        int[] led = new int[10];
        backtrack(led, 0, num);
        return list;
    }

    private void backtrack(int[] led, int index, int num) {
        if (num == 0) {
            int hours = 0, multi = 1;
            for (int i = 3;i>=0;--i){
                hours += (led[i] * multi);
                multi *= 2;
            }
            if (hours > 11) return;
            int mins = 0;
            multi = 1;
            for (int i = 9;i>=4;--i){
                mins += (led[i] * multi);
                multi *= 2;
            }
            if (mins > 59) return;
            String cur = String.valueOf(hours) + ":";
            if (mins <= 9) cur += ("0" + String.valueOf(mins));
            else cur += String.valueOf(mins);
            list.add(cur);
            return;
        }
        else { // num != 0
            for (int i=index;i<=9;++i) {
                led[i] = 1;
                backtrack(led, i+1, num-1);
                led[i] = 0;
            }
        }
    } 

    public static void main(String[] args) {
        Solution s = new Solution();
        List<String> ans = s.readBinaryWatch(2);
        System.out.println(ans);
    }
}