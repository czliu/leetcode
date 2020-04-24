// 0028. Implement strStr()
//string

package _0028;

class Solution {
    public int strStr(String haystack, String needle) {
        // the following comment will fail strStr("", "")
        //if (needle == "" || needle == null) return 0;
        if (needle.length() == 0 || needle == null) return 0;
        for (int i = 0; i <= haystack.length() - needle.length(); ++i){
            int j = 0;
            for (;j < needle.length(); ++j){
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
            }
            if (j == needle.length()) return i;
        }
        return -1;
    }
}