//66.Plus One

#include <iostream>
#include <Vector>
using namespace std; 

class Solution {
public:
    vector<int> plusOne(vector<int>& digits) {
        int size = digits.size();
        digits[size-1] += 1;
        for (int i=size-1;i>=0;i--){
            if (digits[i] == 10){
                digits[i] = 0;
                if (i == 0){
                    digits.insert(digits.begin(), 1);
                } else {
                    digits[i-1] += 1;
                }           
            }
        }
        return digits;
    }
};

int main(void) {
    Solution s;
    vector<int> a{9,9,9};
    a = s.plusOne(a);
    for (auto i:a) cout << i << " ";
    return 0;
}