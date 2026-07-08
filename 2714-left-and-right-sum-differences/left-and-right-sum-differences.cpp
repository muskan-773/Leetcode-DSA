class Solution {
public:
    vector<int> leftRightDifference(vector<int>& nums) {
        vector<int> ans(nums.size());
        int totalSum = 0;
        for(int num : nums) totalSum += num;
        int leftSum = 0;
        for (int i = 0; i < nums.size(); i++) {
            totalSum -= nums[i];             
            ans[i] = abs(leftSum - totalSum);
            leftSum += nums[i];
        }
        return ans;
    }
};