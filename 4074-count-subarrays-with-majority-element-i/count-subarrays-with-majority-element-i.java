class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int n = nums.length;
        int count = 0;
        int freq = 0;
        for(int i = 0;i < n;i++){
            freq = 0;
            for(int j = i;j < n;j++){
                if(nums[j] == target){
                    freq++;
                }
                int length = j - i + 1;
                if(freq > length/2) count++;
            }
        }
        return count;
    }
}