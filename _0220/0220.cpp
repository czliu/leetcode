// 220. Contains Duplicate III

// Bucket Sort 桶排序

#include <iostream>
#include <vector>
#include <string>
#include <cmath>
#include <algorithm>
using namespace std; 

class Bucket{
public:
    bool used = false;
    int val = 0;
};

class Solution {
public:
    bool containsNearbyAlmostDuplicate(vector<int>& nums, int k, int t) {
        if (t<0 || k<=0) return false;
        if (nums.size() <= 0) return false;
        long long int minBucketSize = (long long int)t+1;
        long long int minn = nums[0], maxn = nums[0];
        for (vector<int>::iterator it = nums.begin(); it != nums.end(); it++) {
            if (*it < minn) minn = *it;
            else if (*it > maxn) maxn = *it;
        }
        int bucketNum = ((maxn-minn)/minBucketSize + 1 > nums.size())? nums.size() : (maxn-minn)/minBucketSize + 1;
        long long int bucketSize = (maxn - minn)/bucketNum + 1;
        vector<Bucket> bucket(bucketNum);
        for (int i=0;i<=nums.size()-1;i++){
            int bucketIndex = (nums[i]-minn)/bucketSize;
            if (bucket[bucketIndex].used == true) return true;
            if (bucketIndex >=1) {
                if (bucket[bucketIndex-1].used == true && abs((long long int)nums[i]-(long long int)bucket[bucketIndex-1].val) <= t) return true;
            }              
            if (bucketIndex+1 <= bucketNum-1){
                if (bucket[bucketIndex+1].used == true && abs((long long int)nums[i]-(long long int)bucket[bucketIndex+1].val) <= t) return true;
            }
            // remove nums[i-k] from bucket
            if (i-k >= 0) {
                int index = (nums[i-k]-minn)/bucketSize;
                bucket[index].used = false;
            }
            // add nums[i] to bucket
            bucket[bucketIndex].used = true;
            bucket[bucketIndex].val = nums[i];
        }
        return false;
    }
};

int main(void){
    Solution s;
    bool result;
    vector<int> nums = {1,2,3,1};
    result = s.containsNearbyAlmostDuplicate(nums,3,0);
    cout << result << endl;
    vector<int> nums2 = {1,0,1,1};
    result = s.containsNearbyAlmostDuplicate(nums2,1,2);
    cout << result << endl;
    vector<int> nums3 = {1,5,9,1,5,9};
    result = s.containsNearbyAlmostDuplicate(nums3,2,3);
    cout << result << endl;
    vector<int> nums4 = {1,2};
    result = s.containsNearbyAlmostDuplicate(nums4,0,1);
    cout << result << endl;
    vector<int> nums5 = {-1,2147483647};
    result = s.containsNearbyAlmostDuplicate(nums5,1,2147483647);
    cout << result << endl;
    vector<int> nums6 = {2,0,-2,2};
    result = s.containsNearbyAlmostDuplicate(nums6,2,1);
    cout << result << endl;
    vector<int> nums7 = {2147483647,-2147483645};
    result = s.containsNearbyAlmostDuplicate(nums7,1,5);
    cout << result;
    return 0;
}