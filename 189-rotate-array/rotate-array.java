class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        rotation(nums, 0, n-1);
        rotation(nums, 0, k-1);
        rotation(nums, k, n-1);
    }
    private void rotation(int[] nums,int st,int end){
        while(st <= end){
            int temp = nums[st];
            nums[st] = nums[end];
            nums[end] = temp;
            st++;
            end--;
        }
    }
}