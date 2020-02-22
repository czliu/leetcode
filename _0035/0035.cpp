//35. Search Insert Position

#include <iostream>
#include <Vector>
using namespace std; 

class Solution {
public:
    int searchInsert(vector<int>& nums, int target) {
        for (int i=0;i<=nums.size()-1;i++){
            if (target == nums[i]){
                return i;
            }
            else if (target < nums[i]){
                return i;
            }
            else if (target > nums[i]){
                if (i == nums.size()-1) return i+1;
                else continue;
            }
        }
    return 0;
    }
};

int main(void) {
    Solution s;
    vector<int> a{1,3,5,6};
    int result = s.searchInsert(a, 2);
    cout << result;
    return 0;
}
