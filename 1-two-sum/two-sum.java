class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int need = target - nums[i];
            if (mp.containsKey(need))
                return new int[] { mp.get(need), i };
            mp.put(nums[i], i);
        }
        return new int[] {};
    }
}

//TC = O(N)
//SC = O(N);

// Dry run :-> nums = [2, 7, 11, 15], target = 9

// Initial:

// map = {}
// i = 0

// nums[i] = 2
// need = 9 - 2 = 7
// map does not contain 7
// store 2 -> 0
// map = {2=0}
// i = 1

// nums[i] = 7
// need = 9 - 7 = 2
// map contains 2
// return [0, 1]
// Result:

// indices = [0, 1]