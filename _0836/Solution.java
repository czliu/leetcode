// 0836. Rectangle Overlap

package _0836;

// 如果两个矩形重叠，那么它们重叠的区域一定也是一个矩形，那么这代表了两个矩形与 x轴平行的边（水平边）投影到 x轴上时会有交集，与 y轴平行的边（竖直边）投影到 y轴上时也会有交集。因此，我们可以将问题看作一维线段是否有交集的问题。

// 矩形 rec1 和 rec2 的水平边投影到 x轴上的线段分别为 (rec1[0], rec1[2]) 和 (rec2[0], rec2[2])。根据数学知识我们可以知道，当 min(rec1[2], rec2[2]) > max(rec1[0], rec2[0]) 时，这两条线段有交集。对于矩形 rec1 和 rec2 的竖直边投影到 y轴上的线段，同理可以得到，当 min(rec1[3], rec2[3]) > max(rec1[1], rec2[1]) 时，这两条线段有交集。

class Solution {

    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        return (Math.min(rec1[2], rec2[2]) > Math.max(rec1[0], rec2[0]) &&
                Math.min(rec1[3], rec2[3]) > Math.max(rec1[1], rec2[1]));
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] rec1 = {7,8,13,15};
        int[] rec2 = {10,8,12,20};
        boolean ans = s.isRectangleOverlap(rec1, rec2);
        System.out.println(ans);
    }
}
