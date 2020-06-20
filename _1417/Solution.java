// 1417. 重新格式化字符串
// #easy
// -

package _1417;

class Solution {
    public String reformat(String s) {
        StringBuilder letter = new StringBuilder();
        StringBuilder digits = new StringBuilder();
        for (int i=0;i<s.length();++i) {
            if (Character.isLetter(s.charAt(i))) letter.append(s.charAt(i));
            else digits.append(s.charAt(i));
        }
        if (Math.abs(letter.length() - digits.length()) > 1) return "";
        if (letter.length() >= digits.length()) return helper(letter, digits);
        else return helper(digits, letter);
    }

    private String helper(StringBuilder a, StringBuilder b) {
        int n = a.length();
        int i = 0;
        StringBuilder sb = new StringBuilder();
        while (i < n) {
            sb.append(a.charAt(i));
            if(i < b.length()) sb.append(b.charAt(i));
            ++i;
        }
        return sb.toString();
    }
}
