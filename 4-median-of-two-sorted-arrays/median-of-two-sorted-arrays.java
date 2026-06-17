class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] ans = new int[m + n];
        int i = 0, j = 0, k = 0;
        while(i < n && j < m){
            if(nums1[i] < nums2[j]){
                ans[k++] = nums1[i++];
            }else{
                ans[k++] = nums2[j++];
            }
        }
        while(i < n){
            ans[k++] = nums1[i++];
        }
        while(j < m){
            ans[k++] = nums2[j++];
        }
        int total = n + m;
        if(total % 2 == 1){
            return ans[total/2];
        }else{
            return (ans[total / 2] + ans[total / 2 - 1]) / 2.0;
        }
    }
}