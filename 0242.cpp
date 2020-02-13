// 242. Valid Anagram

#include <iostream>
using namespace std;

class Solution {
public:
    bool isAnagram(string s, string t) {
        if (s.length() != t.length()) return false;
        int Hash_s[26] = {0};
        int Hash_t[26] = {0};
        for (int i=0;i<s.length();i++){
            Hash_s[s[i]-'a']++;
            Hash_t[t[i]-'a']++;
        }
        for (int i=0;i<26;i++){
            if (Hash_s[i] != Hash_t[i]) return false;
        }
        return true;
    }
};

int main(void) {
    Solution a;
    string s = "anagram";
    string t = "nagaram";
    bool b=a.isAnagram(s, t);
    cout << b;
    return 0;
}