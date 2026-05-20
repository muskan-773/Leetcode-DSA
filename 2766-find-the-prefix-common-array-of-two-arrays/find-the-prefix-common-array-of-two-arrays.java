class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        HashSet<Integer> st = new HashSet<>();
        int[] ans = new int[A.length];
        int count = 0;
        for(int i = 0;i < A.length;i++){
            if(!st.add(A[i])) count++;
            if(!st.add(B[i])) count++;
            ans[i] = count;
        }
        return ans;
    }
}