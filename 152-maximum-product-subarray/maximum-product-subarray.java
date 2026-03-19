class Solution {
    public int maxProduct(int[] nums) {
        int n =nums.length;
        int maxProd = -10;

        for(int i = 0;i < n;i++){
            int product = 1;
            for(int j = i;j < n;j++){
                product *= nums[j];
                maxProd = Math.max(product,maxProd);
            }
        }
        return maxProd;
    }
}