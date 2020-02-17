// 164. Maximum Gap
// bucket sort（桶排序）

#include <iostream>
#include <vector>
using namespace std; 

class Bucket{
public:
    bool used = false;
    int min = INT_MAX;
    int max = INT_MIN;
};

class Solution {
public:
    int maximumGap(vector<int>& nums) {
        // n: number of elements in the array
        int n = nums.size();
        if (n<2) return 0;
        // maximum and minimum element in the array
        int minn = nums[0], maxn = nums[0];
        for (vector<int>::iterator it = nums.begin(); it != nums.end(); it++) {
            if (*it < minn) minn = *it;
            else if (*it > maxn) maxn = *it;
        }
        // size and number of buckets
        int bucketSize = max(1, (maxn-minn)/n);
        int bucketNum = (maxn-minn)/bucketSize + 1;
        vector<Bucket> bucket(bucketNum);
        for (vector<int>::iterator it = nums.begin(); it != nums.end(); it++) {
            int bucketIndex = (*it - minn)/bucketSize;
            bucket[bucketIndex].used = true;
            bucket[bucketIndex].min = min(*it, bucket[bucketIndex].min);
            bucket[bucketIndex].max = max(*it, bucket[bucketIndex].max);
        }
        // calculate maxGap
        int maxGap = bucket[0].max - bucket[0].min;
        int lastMax = bucket[0].max;
        for (vector<Bucket>::iterator it = bucket.begin(); it != bucket.end(); it++) {
            if (!it->used) continue;
            maxGap = max(maxGap, it->min - lastMax);
            lastMax = it->max;
        }
        return maxGap;
    }
};

int main(void){
    Solution s;
    vector<int> nums = {3,6,9,1};
    int maxGap = s.maximumGap(nums);
    cout << maxGap << endl;
    vector<int> nums2 = {10};
    maxGap = s.maximumGap(nums2);
    cout << maxGap << endl;
    vector<int> nums3 = {1,1,1,1};
    maxGap = s.maximumGap(nums3);
    cout << maxGap << endl;
    vector<int> nums4 = {1,99};
    maxGap = s.maximumGap(nums4);
    cout << maxGap << endl;
    return 0;
}