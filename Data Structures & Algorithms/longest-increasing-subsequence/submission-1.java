class Solution {
    public int lengthOfLIS(int[] nums) {
        int[][] dp = new int[nums.length][2002];

        for(int[] arr : dp){
            Arrays.fill(arr,-1);
        }

        int len = compute(nums,0,-1001,dp);

        return len;

    }

    public static int compute(int[] nums,int i,int num,int[][] dp){
        int val = num;
        if(num < 0){
            val = num + 2001;
        }

        if(i >= nums.length){
            return 0;
        }

        if(dp[i][val] != -1){
            return dp[i][val];
        }

        int pick = 0;

        if(nums[i] > num){
            pick = 1 + compute(nums,i+1,nums[i],dp);
        }

        int skip = compute(nums,i+1,num,dp);

        dp[i][val] = Math.max(pick,skip);
        return dp[i][val];

    }

}
