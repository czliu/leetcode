// 169. Majority Element

#include <iostream>
#include <vector>
#include <string>
#include <cmath>
#include <algorithm>
using namespace std; 

class Solution {
public:
    int majorityElement(vector<int>& nums) {
        vector<int> d{nums[0]}; // distinct nums
        vector<int> freq{1};
        for (int i=1;i<=nums.size()-1;i++){
            for (int j=0;j<=d.size()-1;j++){
                if (nums[i] == d[j]) {
                    freq[j]++;
                    break;
                } else if (j == d.size()-1){
                    d.push_back(nums[i]);
                    freq.push_back(1);
                }
            }
        }
        for (int i=0;i<=freq.size()-1;i++){
            if (freq[i]>nums.size()/2) return d[i];
        }
        return 0;
    }
};

int main(void) {
    Solution s;
    vector<int> a{3,2,3};
    int result = s.majorityElement(a);
    cout << result << " ";
    vector<int> b{2,2,1,1,1,2,2};
    result = s.majorityElement(b);
    cout << result << " ";
    return 0;
}
