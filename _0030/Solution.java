// 0030. Substring with Concatenation of All Words
// Hashmap, 滑动窗口
// 复习

package _0030;

import java.util.*;

class Solution {

// 1.由于每个单词长度一样，窗口向右扩展以单词为单位，当遇到不存在的单词，窗口清空，从下一个单词开始匹配
// 2.当遇到重复次数过多的单词，窗口左侧收缩到第一次重复的位置的下一个单词，相当于窗口从左侧删除了重复单词
// 3.当窗口长度等于单词总长度时，说明遇到了匹配的子串
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> ans = new ArrayList<>();
        if (s == null || words == null || words.length == 0) return ans;
        int wordLen = words[0].length();
        int wordNum = words.length;
        int totalLen = wordLen * wordNum;
        // 把数组处理成Hashmap以提高检索速度
        HashMap<String, Integer> mapWords = new HashMap<>(); 
        for (String word : words) {
            mapWords.put(word, mapWords.getOrDefault(word, 0) + 1);
        }
        HashMap<String, Integer> map = new HashMap<>();
        for (int i=0;i<=wordLen-1;i++) {
            int index = i;
            for (int j=i;j<=s.length()-wordLen;j+=wordLen) {
                String word = s.substring(j, j+wordLen);
                if (!mapWords.containsKey(word)) {
                    // 遇到不匹配的word，清空map，重新开始匹配
                    map.clear();
                    index = j + wordLen;
                } else {
                    // 遇到匹配的word
                    int count = map.getOrDefault(word, 0);
                    // 遇到重复次数过多的单词，窗口左侧收缩到第一次重复的位置的下一个单词，相当于窗口从左侧删除了重复单词
                    if (count == mapWords.getOrDefault(word, 0)) {
                        String temp = s.substring(index, index + wordLen);
                        while (!temp.equals(word)) {
                            map.put(temp, map.get(temp) - 1);
                            index += wordLen;
                            temp = s.substring(index, index + wordLen);
                        }
                        // 删除第一个重复的word，加上新加入的word，当前word在map中的个数不变
                        index += wordLen;
                    // 遇到匹配的word并且map里的重复计数小于mapWords里的计数
                    } else map.put(word, map.getOrDefault(word, 0) + 1);
                    if (j + wordLen - index == totalLen) {
                        ans.add(index);
                        String temp = s.substring(index, index + wordLen);
                        map.put(temp, map.get(temp) -1);
                        index += wordLen;
                    }
                }
            }
            map.clear();
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String s1 = "wordgoodgoodgoodbestword";
        String[] words = {"word","good","best","word"};
        List<Integer> result1 = s.findSubstring(s1, words);
        System.out.println(result1);
    }
}
