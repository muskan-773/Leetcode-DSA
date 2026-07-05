class Solution {
    public int maxProfit(int[] arr) {
        int n = arr.length;
        int maxProfit = 0;
        for(int i = 1;i < n;i++){
            if(arr[i] > arr[i-1]){
                maxProfit += (arr[i] - arr[i-1]);
            }
        }
        return maxProfit;
    }
}