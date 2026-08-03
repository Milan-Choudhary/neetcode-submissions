class Solution {
    public int rob(int[] nums) {
        
        int[] dp = new int[nums.length];

        Arrays.fill(dp,-1);

        int ans = compute(nums,0,dp);

        return ans;

    }

    public static int compute(int[] nums,int i,int[] dp){

        if(i >= nums.length){
            return 0;
        }

        if(dp[i] != -1){
            return dp[i];
        }


        int a = nums[i] + compute(nums,i+2,dp);
        int b = compute(nums,i+1,dp);

        dp[i] = Math.max(a,b);
        return dp[i];


    }

}
