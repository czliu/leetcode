//1.Two Sum

#include <iostream>
#include <Vector>
using namespace std; 

class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        vector<int> result;
        for (int i=0; i<nums.size(); i++){
            for (int j=i+1; j<nums.size(); j++){
                if (nums[i] + nums[j] == target){
                    result.push_back(i);
                    result.push_back(j);
                }
            }
        }
        return result;
    }
};

int main(void) {
    Solution s;
    vector<int> a{2,7,11,15};
    vector<int> result = s.twoSum(a, 9);
    for (auto i:result) cout << i << " ";
    return 0;
}

