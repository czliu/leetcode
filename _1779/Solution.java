package _1779;

public class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int[] point = new int[2];
        int index = -1;
        int dist = -1;
        for (int i=0;i<points.length;++i) {
            if ((points[i][0] == x) || (points[i][1] == y)) {
                if (dist == -1) {
                    point = points[i];
                    dist = Math.abs(points[i][0] - x) + Math.abs(points[i][1] - y);
                    index = i;
                }
                else if (dist > Math.abs(points[i][0] - x) + Math.abs(points[i][1] - y)) {
                    point = points[i];
                    dist = Math.abs(points[i][0] - x) + Math.abs(points[i][1] - y);
                    index = i;
                }
                else if (dist == Math.abs(points[i][0] - x) + Math.abs(points[i][1] - y)) {
                    if (point[0]+point[1] > points[i][0] + points[i][1]) {
                        point = points[i];
                        index = i;
                    }
                }
            }
        }
        return index;
    }
}
