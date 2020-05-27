// 0720.词典中最长的单词 
// #easy #trie
// *

package _0720;

import java.util.*;

public class Solution {

    // 前缀树 + 深度优先搜索
    // 由于涉及到字符串的前缀，通常可以使用 trie（前缀树）来解决。
    // 将所有单词插入 trie，然后从 trie 进行深度优先搜索，每找到一个单词表示该单词的全部前缀均存在，我们选取长度最长的单词。
    public String longestWord(String[] words) {
        Trie trie = new Trie();
        int index = 0;
        for (String word : words) {
            trie.insert(word, ++index); // indexed by 1
        }
        trie.words = words;
        return trie.dfs();
    }
}

class Node {
    char c;
    HashMap<Character, Node> children = new HashMap<>();
    int end;

    public Node(char c) {
        this.c = c;
    }
}

class Trie {
    Node root;
    String[] words;

    public Trie() {
        root = new Node('0');
    }

    public void insert(String word, int index) {
        Node cur = root;
        for (char c : word.toCharArray()) {
            cur.children.putIfAbsent(c, new Node(c));
            cur = cur.children.get(c);
        }
        cur.end = index;
    }

    public String dfs() {
        String ans = "";
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.empty()) {
            Node node = stack.pop();
            if (node.end > 0 || node == root) {
                if (node != root) {
                    String word = words[node.end - 1];
                    if (word.length() > ans.length() || word.length() == ans.length() && word.compareTo(ans) < 0) {
                        ans = word;
                    }
                }
                for (Node nei : node.children.values()) {
                    stack.push(nei);
                }
            }
        }
        return ans;
    }
}

// 自己写的HashMap
class Solution2 {
    public String longestWord(String[] words) {
        Map<Integer, List<String>> map = new HashMap<>();
        for (int i=0;i<words.length;++i) {
            int len = words[i].length();
            if (map.containsKey(len)) {
                List<String> list = map.get(len);
                list.add(words[i]);
                map.put(len, list);
            }
            else {
                List<String> list = new LinkedList<>();
                list.add(words[i]);
                map.put(len, list);
            }
        }
        if (!map.containsKey(1)) return "";
        int i = 2;
        boolean valid = false;
        while (map.containsKey(i)) {
            List<String> list = map.get(i);
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                String s = (String)it.next();
                valid = false;
                for (String pre : map.get(i-1)) {
                    if (s.substring(0, s.length()-1).equals(pre)) {
                        valid = true;
                        break;
                    }
                }
                if (valid == false) it.remove();
            }
            if (list.size() == 0) break;
            else ++i;
        }
        if (map.containsKey(i) && map.get(i).size() != 0) return getFirstOrder(map.get(i));
        else return getFirstOrder(map.get(i-1));

    }

    private String getFirstOrder(List<String> list){
        Iterator<String> it = list.iterator();
        String s = (String)it.next();
        int n = s.length();
        String ans = s;
        while (it.hasNext()) {
            String cur = (String)it.next();
            for (int i=0;i<n;++i) {
                if (cur.charAt(i) - ans.charAt(i) < 0) {
                    ans = cur;
                    break;
                } else if (cur.charAt(i) - ans.charAt(i) > 0) break;
            }
        }
        return ans;
    }
}