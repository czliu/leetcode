// 733. 图像渲染
// #easy
// -

package _0733;

import java.util.*;

public class Solution {

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        Stack<int[]> stack = new Stack<>();
        int[] deltaR = new int[] {-1, 0, 0, 1}; 
        int[] deltaC = new int[] { 0,-1, 1, 0}; 
        int val = image[sr][sc];
        if (newColor == val) return image; // this should not be missed
        stack.push(new int[] {sr, sc});
        while (!stack.isEmpty()) {
            int[] cur = stack.pop();
            image[cur[0]][cur[1]] = newColor;
            for (int i=0;i<4;++i) {
                int r = cur[0] + deltaR[i];
                int c = cur[1] + deltaC[i];
                if (r>=0 && r<image.length && c>=0 && c<image[0].length && image[r][c] == val) 
                    stack.push(new int[] {r,c});
            }
        }
        return image;
    }
    
}