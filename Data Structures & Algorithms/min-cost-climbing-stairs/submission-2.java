class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length + 1];

        Arrays.fill(dp,-1);

        int ans1 = compute(cost,0,dp);
        int ans2 = compute1(cost,1,dp);

        return Math.min(ans1,ans2);

    }

    public static int compute(int[] cost,int i,int[] dp){

        if(i >= cost.length){
            return 0;
        }

        if(dp[i] != -1){
            return dp[i];
        }

        
        int a = cost[i] + compute(cost,i+1,dp);
        int b = cost[i] + compute(cost,i+2,dp);

        dp[i] = Math.min(a,b);
        return dp[i];


    }

    public static int compute1(int[] cost,int i,int[] dp){

        if(i >= cost.length){
            return 0;
        }

        if(dp[i] != -1){
            return dp[i];
        }
        
        int a = cost[i] + compute1(cost,i+1,dp);
        int b = cost[i] + compute1(cost,i+2,dp);

        dp[i] = Math.min(a,b);
        return dp[i];


    }

}
