// 806. 写字符串需要的行数
// #easy
// -

package _0806;

class Solution {

    public int[] numberOfLines(int[] widths, String S) {
        int numLines = 1, curLine = 0;
        for (int i=0;i<S.length();++i) {
            int width = widths[S.charAt(i) - 'a'];
            if (curLine + width <= 100) curLine += width;
            else {
                ++numLines;
                curLine = width;
            }
        }
        return new int[] {numLines, curLine};
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] ans = s.numberOfLines(new int[] {4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10}, "bbbcccdddaaa");
        System.out.println(ans);
    }

}