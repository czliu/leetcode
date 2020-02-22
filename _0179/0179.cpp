// 179. Largest Number

#include <iostream>
#include <vector>
#include <string>
#include <cmath>
using namespace std; 

class Solution {
public:
    string largestNumber(vector<int>& nums) {
        if (nums.size() == 0) return nullptr;
        if (nums.size() == 1) return to_string(nums[0]);
        vector<int> result = {nums[0]};
        for (int i=1; i<=nums.size()-1;i++) {
            for (int j=0; j<=result.size()-1;j++){
                if (compare(nums[i], result[j])){
                    result.insert(result.begin()+j, nums[i]);
                    break;
                } else if (j == result.size()-1){
                    result.push_back(nums[i]);
                    break;
                }
            }
        }
        string resultString = "";
        for (int i=0; i<=result.size()-1;i++){
            resultString = (resultString == "0")? to_string(result[i]) : resultString + to_string(result[i]);
        }
        return resultString;
    }

    // if a should be placed before b, return 1, else return 0
    bool compare(int a, int b){
        // // pay attention when a or b == 0, log10(0)
        // double ab = (double)a * pow(10, (int)log10(b)+1) + (double)b;
        // double ba = (double)b * pow(10, (int)log10(a)+1) + (double)a;
        return to_string(a) + to_string(b) > to_string(b) + to_string(a);
    }
};

int main(void){
    Solution s;
    vector<int> nums = {3,30,34,5,9};
    string result = s.largestNumber(nums);
    cout << result << endl;
    vector<int> nums2 = {1,2,3,4,5,6,7,8,9,0};
    result = s.largestNumber(nums2);
    cout << result << endl;
    vector<int> nums3 = {0,0};
    result = s.largestNumber(nums3);
    cout << result;
    return 0;
}