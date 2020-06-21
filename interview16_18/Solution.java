// 面试题 16.18. 模式匹配
// #medium
// -

package interview16_18;

class Solution {
    public boolean patternMatching(String pattern, String value) {
        int lenP = pattern.length(), lenV = value.length();
        if (lenP == 0 && lenV == 0) return true;
        if (lenP == 0) return false;
        // pattern[0] -> 'x', the other -> 'y'
        StringBuilder sb = new StringBuilder();
        int[] count = new int[2];
        for (int i=0;i<lenP;++i) {
            if (pattern.charAt(i) == pattern.charAt(0)) {
                sb.append('x');
                ++count[0];
            }
            else {
                sb.append('y');
                ++count[1];
            }
        }
        if (lenV == 0) {
            if (count[0] != 0 && count[1] != 0) return false;
            else return true;
        }
        for (int lenX=0;lenX<=lenV/count[0];++lenX) {
            int lenYTotal = lenV - lenX * count[0];
            if (count[1] == 0 && lenYTotal != 0) continue;
            else if (count[1] != 0 && lenYTotal % count[1] == 0) {
                int lenY = lenYTotal / count[1];
                if (check(lenX, lenY, sb, value)) return true;
            }
            else if (count[1] == 0 && lenYTotal == 0) {
                if (check(lenX, 0, sb, value)) return true;
            }
        }
        return false;
    }

    private boolean check(int lenX, int lenY, StringBuilder sb, String value) {
        String x = value.substring(0, lenX);
        String y = "";
        int index = 0, i = 0;
        while (index < value.length()) {
            if (sb.charAt(i) == 'x') {
                if (!value.substring(index, index+lenX).equals(x)) return false;
                index += lenX;
                ++i;
            }
            else {
                if (y.length() == 0) {
                    y = value.substring(index, index+lenY);
                    index += lenY;
                    ++i;
                } else {
                    if (!value.substring(index, index+lenY).equals(y)) return false;
                    index += lenY;
                    ++i;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        boolean ans = s.patternMatching("a", "");
        System.out.println(ans == true);
        boolean ans2 = s.patternMatching("abba", "dogcatcatdog");
        System.out.println(ans2 == true);
        boolean ans3 = s.patternMatching("ab", "");
        System.out.println(ans3 == false);
    }
}