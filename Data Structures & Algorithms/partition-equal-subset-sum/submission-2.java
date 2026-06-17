class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;

        for(int n : nums){
            sum += n;
        }

        if(sum%2 != 0){
            return false;
        }

        sum = sum/2;

        Boolean[][] dp = new Boolean[nums.length+1][sum+1];

        return compute(nums,0,sum,dp);

    }

    public static boolean compute(int[] nums,int i,int t,Boolean[][] dp){

        if(t == 0){
            return true;
        }

        if(i >= nums.length || t < 0){
            return false;
        }

        if(dp[i][t] != null){
            return dp[i][t];
        }

        boolean a = compute(nums,i+1,t-nums[i],dp);
        boolean b = compute(nums,i+1,t,dp);


        dp[i][t] = a || b;
        return dp[i][t];

    }

}
