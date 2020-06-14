// 1184. 公交站间的距离
// #easy
// -

package _1184;

class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int n = distance.length;
        int a = 0, i = start;
        while (i != destination) {
            a += distance[i];
            ++i;
            if (i == n) i = 0;
        }
        int b = 0;
        i = start;
        while (i != destination) {
            if (i == 0) i = n;
            --i;
            b += distance[i];
        }
        return Math.min(a, b);
    }
}
