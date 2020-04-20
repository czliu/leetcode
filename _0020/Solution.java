// 0020. Valid parentheses

// string

package _0020;

import java.util.*;

public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()){
            if (c == '(' || c == '[' || c == '{') stack.push(c);
            else if (c == ')'){
                if (stack.isEmpty() || stack.pop() != '(') return false;
            }
            else if (c == ']'){
                if (stack.isEmpty() || stack.pop() != '[') return false;
            }
            else if (c == '}'){
                if (stack.isEmpty() || stack.pop() != '{') return false;
            }
        }
        if (stack.isEmpty()) return true;
        else return false;
    }

}