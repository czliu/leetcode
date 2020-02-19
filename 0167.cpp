// 167. Two Sum II - Input array is sorted

// 双指针

#include <iostream>
#include <vector>
#include <string>
#include <cmath>
#include <algorithm>
using namespace std; 

class Solution {
public:
    vector<int> twoSum(vector<int>& numbers, int target) {
        int i=0, j=numbers.size()-1;
        while (i<j) {
            if (numbers[i] + numbers[j] < target) i++;
            else if (numbers[i] + numbers[j] > target) j--;
            else return {i+1, j+1};
        }
        return {-1, -1};
    }
};

int main(void) {
    Solution s;
    vector<int> a{2,7,11,15};
    vector<int> result = s.twoSum(a, 9);
    for (auto i:result) cout << i << " ";
    return 0;
}
