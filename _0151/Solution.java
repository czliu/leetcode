// 0151. Reverse words in a string

package _0151;

public class Solution {

    public String reverseWords(String s) {
        if (s.length() == 0) return "";
        boolean insideWord = false;
        int curWordEnd = s.length();
        String ans = "";
        for (int i=s.length()-1;i>=0;--i){
            if (i == 0 && s.charAt(i) != ' ') {
                if (insideWord == false) ans += s.substring(0, 1) + " ";
                else ans += s.substring(i, curWordEnd+1) + " ";
                break;
            }
            if (s.charAt(i) == ' '){
                if (insideWord == false) continue;
                else {
                    ans += s.substring(i+1, curWordEnd+1) + " ";
                    insideWord = false;
                }
            }
            else { // s.charAt(i) != ' '
                if (insideWord == false){
                    insideWord = true;
                    curWordEnd = i;
                    continue;
                }
                else continue;
            }
        }
        if (ans.length() > 0) ans = ans.substring(0, ans.length()-1);
        return ans;
    }

    public static void main(String[] args){
        Solution a = new Solution();
        String ans = a.reverseWords(" ");
        System.out.println(ans);

    }

}