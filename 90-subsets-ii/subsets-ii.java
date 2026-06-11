class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        solve(ans, new ArrayList<>(), nums, 0);
        return ans;
    }
    private void solve(List<List<Integer>> ans, List<Integer> curr, int[] nums, int idx){

        if(ans.contains(curr)) return;
        ans.add(new ArrayList<>(curr));
        for (int i = idx; i < nums.length; i++) {
            curr.add(nums[i]);
            solve(ans, curr, nums, i + 1);
            curr.remove(curr.size() - 1);
        }
    }
}