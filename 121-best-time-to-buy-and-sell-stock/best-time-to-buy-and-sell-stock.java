class Solution {
    public int maxProfit(int[] arr) {
        int n = arr.length;
        int min = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i = 0;i < n;i++){
            min = Math.min(min, arr[i]);
            maxProfit = Math.max(maxProfit, arr[i] - min);
        }
        return maxProfit;
    }
}