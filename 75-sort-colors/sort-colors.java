class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int j = 0;
        int i =0;
        while(i < n){
            if(nums[i] == 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
            i++;
        }
        i = j;
        while(i < n){
            if(nums[i] == 1){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
            i++;
        }
        
    }
}