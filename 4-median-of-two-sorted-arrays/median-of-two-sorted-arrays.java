class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        int[] ans = new int[m+n];

        for(int i = 0;i < m;i++) ans[i] = nums1[i];
        for(int i = 0;i < n;i++) ans[m+i] = nums2[i];

        Arrays.sort(ans);

        int total = m+n;
        if(total % 2 == 1) return ans[total/2];
        else return (ans[total/2] + ans[total/2-1])/2.0;
    }
}