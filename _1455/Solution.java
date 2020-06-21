// 1455. 检查单词是否为句中其他单词的前缀
// #easy
// -

package _1455;

class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] words = sentence.split(" ");
        for (int i=0;i<words.length;++i) {
            if (isPrefix(words[i], searchWord)) return i+1;
        }
        return -1;
    }

    private boolean isPrefix(String word, String searchWord) {
        if (word.length() < searchWord.length()) return false;
        for (int i=0;i<searchWord.length();++i) {
            if (word.charAt(i) != searchWord.charAt(i)) return false;
        }
        return true;
    }
}