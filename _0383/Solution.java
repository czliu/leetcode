// 0383. Ransom note
// string

package _0383;

//import java.util.*;

public class Solution {

    public boolean canConstruct(String ransomNote, String magazine) {
        int[] r = new int[26];
        int[] m = new int[26];
        for (int i=0; i<ransomNote.length();++i){
            int tmp = ransomNote.charAt(i) - 'a';
            ++r[tmp];
        }
        for (int i=0; i<magazine.length();++i){
            int tmp = magazine.charAt(i) - 'a';
            ++m[tmp];
        }
        for (int i=0; i<26; ++i){
            if (r[i] > m[i]) return false;
        }
        return true;
    }
}