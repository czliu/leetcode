// 0492. construct the rectangle
// #easy
// -

package _0492;

public class Solution {

    public int[] constructRectangle(int area) {
        int m = (int)Math.sqrt(area);
        while (area % m != 0) {
            --m;
        }
        return new int[] {area/m, m};
    }
    
}