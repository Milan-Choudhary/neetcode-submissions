class Solution {
    private Map<String, Integer> memo;

    public int findTargetSumWays(int[] nums, int target) {
        memo = new HashMap<>();
        return compute(nums, target, 0, 0);
    }

    public int compute(int[] nums, int t, int i, int x) {
        String key = i + "," + x;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }

        if (i == nums.length) {
            return t == x ? 1 : 0;
        }

        int a = compute(nums, t, i + 1, x + nums[i]);
        int b = compute(nums, t, i + 1, x - nums[i]);

        memo.put(key, a + b);
        return a + b;
    }
}